class Solution {
    public void moveZeroes(int[] arr) {
        if (arr.length == 1) {
            return;
        }

        int n = arr.length;
        int k = 0;

        // Move non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }

        // Fill remaining positions with 0
        for (int i = k; i < n; i++) {
            arr[i] = 0;
        }
    }
}