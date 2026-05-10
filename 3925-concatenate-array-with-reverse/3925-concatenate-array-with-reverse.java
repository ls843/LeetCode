class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int result[] = new int[n * 2];

        for(int i = 0; i < n; i++) {
            result[i] = nums[i];
        }

        int idx = n;
        for(int i = n - 1; i >= 0; i--) {
            result[idx++] = nums[i];
        }

        return result;
    }
}