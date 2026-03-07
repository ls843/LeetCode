class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String t = s + s;

        int count1 = 0, count2 = 0;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n * 2; i++) {
            char ch = t.charAt(i);
            
            int expected1 = (i % 2 == 0) ? '0' : '1';
            int expected2 = (i % 2 == 0) ? '1' : '0';

            if(ch != expected1) count1++;
            if(ch != expected2) count2++;

            if(i >= n) {
                char oldExpect1 = ((i - n) % 2 == 0) ? '0' : '1';
                char oldExpect2 = ((i - n) % 2 == 0) ? '1' : '0';

                if(t.charAt(i - n) != oldExpect1) count1--;
                if(t.charAt(i - n) != oldExpect2) count2--;
            }

            if(i >= n - 1) {
                ans = Math.min(ans, Math.min(count1, count2));
            }
        }

        return ans;
    }
}