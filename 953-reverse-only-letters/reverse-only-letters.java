class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length() - 1;

        char[] arr = s.toCharArray();

        while (i < j) {

            // Move i until it points to a letter
            while (i < j && !isEnglish(arr[i])) {
                i++;
            }

            // Move j until it points to a letter
            while (i < j && !isEnglish(arr[j])) {
                j--;
            }

            // Swap letters
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }

    public static boolean isEnglish(char c) {
        return (c >= 'A' && c <= 'Z') ||
               (c >= 'a' && c <= 'z');
    }
}