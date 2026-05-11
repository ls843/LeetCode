class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            String s = String.valueOf(nums[i]);

            for(char ch : s.toCharArray()) {
                result.add(ch - '0');
            }
        }

        int arr[] = new int[result.size()];

        for(int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }

        return arr;
    }
}