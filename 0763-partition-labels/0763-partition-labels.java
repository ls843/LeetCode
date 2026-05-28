class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) > end) {
                end = map.get(s.charAt(i));
            }

            if(i == end) {
                int partitionSize = end - start + 1;
                result.add(partitionSize);
                start = i + 1;
            }
        }  

        return result;      
    }
}