class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> result = new ArrayList<>();
        backtrack("", 0, n, k, result);
        return result;
    }

    private void backtrack(String current, int cost, int n, int k, List<String> result) {
        if(current.length() == n && cost <= k) {
            result.add(current);
            return;
        }

        if(cost > k) return;

        backtrack(current + "0", cost, n, k, result);

        if(current.length() == 0 || current.charAt(current.length() - 1) == '0') {
            backtrack(current + "1", cost + current.length(), n , k, result);
        }
    }
}