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
    int sum = 0;
    int height = 0;
    int totalHeight = 0, currentHeight = 0;

    public int deepestLeavesSum(TreeNode root) {
        totalHeight = heightOfTree(root);
        sumOfLeaves(root, 1, totalHeight);
        return sum;
    }

    private int heightOfTree(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    private void sumOfLeaves(TreeNode root, int currentHeight, int totalHeight) {
        if(root == null) return;

        if(currentHeight == totalHeight) {
            sum += root.val;
        }

        sumOfLeaves(root.left, currentHeight + 1, totalHeight);
        sumOfLeaves(root.right, currentHeight + 1, totalHeight);
    }
}