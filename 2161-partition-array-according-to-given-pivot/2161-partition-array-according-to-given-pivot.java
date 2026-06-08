class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;

        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(nums[i] < pivot) {
                less.add(nums[i]);
            }
            else if(nums[i] == pivot) {
                equal.add(nums[i]);
            }
            else {
                greater.add(nums[i]);
            }
        }

        int res[] = new int[n];
        int index = 0;

        for(int num : less) res[index++] = num;
        for(int num : equal) res[index++] = num;
        for(int num : greater) res[index++] = num;

        return res;

    }
}