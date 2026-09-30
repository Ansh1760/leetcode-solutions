class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int low = 0;
        int high = 0;
        int sum = 0;
        int res = 0;

        while (high < arr.length) {

            sum += arr[high];

            if (high - low + 1 == k) {

                int avg = sum / k;

                if (avg >= threshold) {
                    res++;
                }

                sum -= arr[low];
                low++;
            }

            high++;
        }

        return res;
    }
}