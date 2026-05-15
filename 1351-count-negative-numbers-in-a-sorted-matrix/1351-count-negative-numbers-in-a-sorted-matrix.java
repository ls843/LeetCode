class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;

        for(int[] row : grid) {
            int low = 0, high = row.length - 1;

            while(low <= high) {
                int mid = low + (high - low) / 2;

                if(row[mid] < 0) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            count += row.length - low;
        }

        return count;
    }
}