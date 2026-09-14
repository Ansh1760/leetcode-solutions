class Solution {
    public String customSortString(String order, String s) {
        int freq[] = new int[26];
        // we will follow s
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        // we will follow order array-
        StringBuilder ans = new StringBuilder();
        for (char ch : order.toCharArray()) {
            while (freq[ch - 'a'] > 0) {
                ans.append(ch);
                freq[ch - 'a']--;
            }
        }
        for (int i = 0; i < 26; i++) {

            while (freq[i] > 0) {
                ans.append((char) ('a' + i));
                freq[i]--;
            }
        }
      return ans.toString();
    }
}