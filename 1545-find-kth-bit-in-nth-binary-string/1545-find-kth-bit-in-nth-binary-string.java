class Solution {
    public char findKthBit(int n, int k) {
        String s = build(n);
        return s.charAt(k - 1);
    }

    public String build(int n) {
        if(n == 1) return "0";

        String prev = build(n - 1);
        String invertedReverse = invertAndReverse(prev);

        return prev + "1" + invertedReverse;
    }

    private String invertAndReverse(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i) == '0' ? '1' : '0');
        }

        return sb.toString();
    }
}