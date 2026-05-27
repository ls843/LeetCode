class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < word.length(); i++) {
            if(Character.isLowerCase(word.charAt(i))) map.put(word.charAt(i), i);
            if(Character.isUpperCase(word.charAt(i))) map.putIfAbsent(word.charAt(i), i);
        }

        for(int i = 0; i < word.length(); i++) {
            char lower = Character.toLowerCase(word.charAt(i));
            char upper = Character.toUpperCase(word.charAt(i));

            if(map.containsKey(lower) && map.containsKey(upper)) {
                if(map.get(lower) < map.get(upper)) {
                    count++;

                    map.remove(lower); 
                    map.remove(upper); 
                }
            }
        }

        return count;
    }
}