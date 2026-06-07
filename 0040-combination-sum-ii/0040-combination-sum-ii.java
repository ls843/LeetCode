class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int idx, List<Integer> current, List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if(target < 0 || idx == candidates.length) return;

        current.add(candidates[idx]);

        backtrack(candidates, target - candidates[idx], idx + 1, current, result);

        current.remove(current.size() - 1);

        int next = idx + 1;
        while(next < candidates.length && candidates[next] == candidates[idx]) {
            next++;
        }

        backtrack(candidates, target, next, current, result);
    }
}