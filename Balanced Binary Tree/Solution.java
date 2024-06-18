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
    private boolean balanced;
    private int balancedHelper(TreeNode node, int prevHeight) {
        if (node == null) return 0;

        int leftHeight = balancedHelper(node.left, 0);
        int rightHeight = balancedHelper(node.right, 0);

        if (leftHeight == -1 || rightHeight == -1) return -1;
        else if (Math.abs(leftHeight - rightHeight) > 1) {
            balanced = false;
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public boolean isBalanced(TreeNode root) {
        balanced = true;
        int unused = balancedHelper(root, 0);
        return balanced;
    }
}