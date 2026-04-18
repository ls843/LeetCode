class Solution {
    public int mirrorDistance(int n) {
        StringBuilder temp = new StringBuilder(String.valueOf(n));
        String s = temp.reverse().toString();
        int reversed = Integer.parseInt(s);
        return Math.abs(n - reversed);
    }
}