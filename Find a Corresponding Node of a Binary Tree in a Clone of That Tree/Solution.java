/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 class Solution {
    TreeNode output = null;
    private void helper(TreeNode node, TreeNode target) {
        if (node == null) return;
        if (node.val == target.val) {
            output = node;
            return;
        }
        helper(node.left, target);
        helper(node.right, target);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        helper(cloned, target);
        return output;
    }
}