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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        inOrder(root1, result1);
        inOrder(root2, result2);

        List<Integer> sorted = new ArrayList<>();
        merge(result1, result2, sorted);

        return sorted;
    } 

    private void inOrder(TreeNode root, List<Integer> result) {
        if(root == null) return;

        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }

    private void merge(List<Integer> result1, List<Integer> result2, List<Integer> sorted) {
        int i = 0, j = 0;

        while(i < result1.size() && j < result2.size()) {
            if(result1.get(i) <= result2.get(j)) {
                sorted.add(result1.get(i));
                i++;
            } else {
                sorted.add(result2.get(j));
                j++;
            }
        }

        while(i < result1.size()) {
            sorted.add(result1.get(i));
            i++;
        }

        while(j < result2.size()) {
            sorted.add(result2.get(j));
            j++;
        }
    }
}