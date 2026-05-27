class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> seen = new HashSet<>();
        int count = 0;

        for(char ch : word.toCharArray()) {
            seen.add(ch);
        }

        for(char ch = 'a'; ch <= 'z'; ch++) {
            char upper = Character.toUpperCase(ch);

            if(seen.contains(ch) && seen.contains(upper)) {
                count++;
            } 
        }

        return count;
    }
}