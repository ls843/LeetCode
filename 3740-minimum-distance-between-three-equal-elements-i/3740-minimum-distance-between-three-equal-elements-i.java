class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            List<Integer> list = map.get(nums[i]);

            list.add(i);

            if(list.size() > 3) {
                list.remove(0);
            }

            if(list.size() == 3) {
                int distance = 2 * (list.get(2) - list.get(0));
                minDistance = Math.min(minDistance, distance);
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}