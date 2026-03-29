class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int diff = Integer.MAX_VALUE;
        int onePos = -1, twoPos = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                onePos = i;
                if(twoPos != -1) {
                    diff = Math.min(diff, Math.abs(onePos - twoPos));
                }
            } else if(nums[i] == 2) {
                twoPos = i;
                if(onePos != -1) {
                    diff = Math.min(diff, Math.abs(onePos - twoPos));
                }
            }
        }

        return diff == Integer.MAX_VALUE ? -1 : diff;    
    }
}