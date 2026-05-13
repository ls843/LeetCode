class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < groupSizes.length; i++) {
            map.putIfAbsent(groupSizes[i], new ArrayList<>());

            map.get(groupSizes[i]).add(i);

            if(map.get(groupSizes[i]).size() == groupSizes[i]) {
                result.add(new ArrayList<>(map.get(groupSizes[i])));
                map.put(groupSizes[i], new ArrayList<>());
            }
        }
        
        return result;
    }
}