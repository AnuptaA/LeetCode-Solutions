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
    private boolean isSub;
    private void subTreeHelper(TreeNode a, TreeNode b) {
        if (a == null && b == null) return;
        else if ((a == null && b != null) || (a != null && b == null) || (a.val != b.val)) {
            isSub = false;
            return;
        }
        subTreeHelper(a.left, b.left);
        subTreeHelper(a.right, b.right);
    }
    private void treeIterator(TreeNode node, TreeNode subNode) {
        if (node == null || isSub) return;
        if (node.val == subNode.val) {
            isSub = true;
            subTreeHelper(node, subNode);
            if (isSub) return;
        }
        treeIterator(node.left, subNode);
        treeIterator(node.right, subNode);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        isSub = false;
        treeIterator(root, subRoot);
        return isSub;
    }
}