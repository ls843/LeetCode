class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int left = 0, satisfied = 0, extra = 0, maxExtra = 0;

        for(int right = 0; right < customers.length; right++) {
            if(grumpy[right] == 0) satisfied += customers[right];
            else extra += customers[right];

            while(right - left + 1 > minutes) {
                if(grumpy[left] == 1) {
                    extra -= customers[left];
                }
                left++;
            } 

            maxExtra = Math.max(maxExtra, extra);
        }

        return satisfied + maxExtra;
    }
}