class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int targetIdx = -1;
        int minDistance = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                targetIdx = i;
                minDistance = Math.min(minDistance, Math.abs(targetIdx - start));
            }
        }

        return minDistance;
    }
}