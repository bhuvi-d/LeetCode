class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int maxlen = 0;

        for (int i = 1; i <= n - 2;) {
            // checking for peak element
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {  
                int count = 1;
                int j = i;

                // left side of mountain
                while (j > 0 && arr[j] > arr[j - 1]) {
                    j--;
                    count++;
                }

                // right side of mountain
                int k = i;
                while (k < n - 1 && arr[k] > arr[k + 1]) {  
                	k++;
                    count++;
                }

                maxlen = Math.max(maxlen, count);
                i = k; 
            } else {
                i++;
            }
        }

        return maxlen;
    }
}
