class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr1.length; i++) {
            while(!set.contains(arr1[i]) && arr1[i] > 0) {
                set.add(arr1[i]);
                arr1[i] /= 10;
            }
        }

        int length = 0;

        for(int i = 0; i < arr2.length; i++) {
            while(!set.contains(arr2[i]) && arr2[i] > 0) {
                arr2[i] /= 10;
            }

            if(arr2[i] > 0) {
                length = Math.max(length, (int)Math.log10(arr2[i]) + 1);
            }
        }

        return length;
    }
}