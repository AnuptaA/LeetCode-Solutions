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
    private int depth;
    private void depthHelper(TreeNode node, int prevDepth) {
        if (node == null) return;
        int currDepth = prevDepth + 1;
        if (currDepth > depth) depth = currDepth;
        depthHelper(node.left, currDepth);
        depthHelper(node.right, currDepth);
    }
    public int maxDepth(TreeNode root) {
        depth = 0;
        depthHelper(root, 0);
        return depth;
    }
}