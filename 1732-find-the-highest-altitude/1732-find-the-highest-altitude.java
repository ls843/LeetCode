class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int altitude[] = new int[n];

        altitude[0] = gain[0];
        for(int i = 1; i < n; i++) {
            altitude[i] = altitude[i - 1] + gain[i];
        }

        int maxAltitude = Integer.MIN_VALUE;
        for(int i = 0; i < altitude.length; i++) {
            maxAltitude = Math.max(maxAltitude, altitude[i]);
        }

        return maxAltitude > 0 ? maxAltitude : 0;
    }
}