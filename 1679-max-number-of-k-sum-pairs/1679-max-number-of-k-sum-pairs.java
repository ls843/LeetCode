class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ops = 0;

        for(int i = 0; i < nums.length; i++) {
            int rem = k - nums[i];

            if(map.containsKey(rem)) {
                ops++;
                map.put(rem, map.get(rem) - 1);
                if(map.get(rem) == 0) map.remove(rem);
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }

        return ops;
    }
}