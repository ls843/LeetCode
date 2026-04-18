class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int val = 0, maxVal = 0, left = 0;

        for(int right = 0; right < nums.length; right++) {
            val += nums[right];

            while(seen.contains(nums[right])) {
                seen.remove(nums[left]);
                val -= nums[left];
                left++;
            }

            seen.add(nums[right]);
            maxVal = Math.max(maxVal, val);
        }

        return maxVal;
    }
}