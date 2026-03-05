class Solution {
    public int minOperations(String s) {
        int ops1 = 0;
        int ops2 = 0;

        for(int i = 0; i < s.length(); i++) {
            char expected1 = (i % 2 == 0) ? '0' : '1';
            char expected2 = (i % 2 == 0) ? '1' : '0';

            if(s.charAt(i) != expected1) ops1++;
            if(s.charAt(i) != expected2) ops2++;
        }

        return Math.min(ops1, ops2);
    }
}