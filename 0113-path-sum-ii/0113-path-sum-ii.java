/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currPathSum = new ArrayList<>();
        calculateSum(root, targetSum, currPathSum, result);
        return result;
    }

    public void calculateSum(TreeNode root, int targetSum, List<Integer> currPathSum, List<List<Integer>> result) {
        if(root == null) return;

        currPathSum.add(root.val);

        if(root.left == null && root.right == null && targetSum == root.val) {
            result.add(new ArrayList<>(currPathSum));
        } else {
            calculateSum(root.left, targetSum - root.val, currPathSum, result);
            calculateSum(root.right, targetSum - root.val, currPathSum, result);
        }

        currPathSum.remove(currPathSum.size() - 1);
    }
}