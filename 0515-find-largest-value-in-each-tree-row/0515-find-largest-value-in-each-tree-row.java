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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int largest = Integer.MIN_VALUE;

        while(!q.isEmpty()) {
            int size = q.size();

            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if(node.val > largest) {
                    largest = node.val;
                }

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }

            result.add(largest);
            largest = Integer.MIN_VALUE;
        }

        return result;
    }
}