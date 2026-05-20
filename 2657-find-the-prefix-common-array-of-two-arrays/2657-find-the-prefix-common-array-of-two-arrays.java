class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int res[] = new int[A.length];
        int common = 0;

        int freq[] = new int[51];
        for(int i = 0; i < A.length; i++) {
            freq[A[i]]++;
            if(freq[A[i]] == 2) {
                common++;
            }

            freq[B[i]]++;
            if(freq[B[i]] == 2) {
                common++;
            }

            res[i] = common;
        }   

        return res;
    }
}