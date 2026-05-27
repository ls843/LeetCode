class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < word.length(); i++) {
            if(Character.isLowerCase(word.charAt(i))) {
                map.put(word.charAt(i), i);
            } else {
                map.putIfAbsent(word.charAt(i), i);
            }
        }

        for(char ch = 'a'; ch <= 'z'; ch++) {
            char upper = Character.toUpperCase(ch);

            if(map.containsKey(ch) && map.containsKey(upper)) {
                if(map.get(ch) < map.get(upper)) {
                    count++;
                }
            }
        }

        return count;
    }
}