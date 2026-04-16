class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt = 0;

        for(int i = 0; i < nums.length; i++) {
            while(nums[i] != 0) {
                int lastDigit = nums[i] % 10;
                if(lastDigit == digit) cnt++;
                nums[i] /= 10; 
            }
        }

        return cnt;
    }
}