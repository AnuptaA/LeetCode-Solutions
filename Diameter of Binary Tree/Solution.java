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
    private int diameter;
    private int diameterHelper(TreeNode node, int prevHeight) {
        if (node == null) return 0;

        int leftHeight = diameterHelper(node.left, 0);
        int rightHeight = diameterHelper(node.right, 0);
        int currHeight = 1 + Math.max(leftHeight, rightHeight);

        if (leftHeight + rightHeight > diameter) diameter = leftHeight + rightHeight;
        return currHeight;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        int unused = diameterHelper(root, 0);
        return diameter;
    }
}