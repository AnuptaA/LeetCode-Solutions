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
    private boolean isSame;
    private void sameHelper(TreeNode p, TreeNode q) {
        if (p == null && q == null) return;
        else if ((p == null && q != null) || (p != null && q == null) || (p.val != q.val)) {
            isSame = false;
            return;
        }
        sameHelper(p.left, q.left);
        sameHelper(p.right, q.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        isSame = true;
        sameHelper(p, q);
        return isSame;
    }
}