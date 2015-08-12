class Solution {
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        if (n == 0) return;

        if (m == 0) {
            for (int j = 0; j < n ; j++) A[j] = B[j];
            return;
        }
        
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (k >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
            if (j == -1) break;
            if (i == -1) {
                while (k >= 0) A[k--] = B[j--];
                break;
            }
        }
    }
}

