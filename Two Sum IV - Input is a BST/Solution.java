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
    private HashSet<Integer> set;
    private boolean res;
    private void dfs(TreeNode node, int target) {
        if (node == null || res) return;
        if (set.contains(target - node.val)) {
            res = true;
            return;
        }
        set.add(node.val);
        dfs(node.left, target);
        dfs(node.right, target);
    }
    public boolean findTarget(TreeNode root, int k) {
        set = new HashSet<>();
        dfs(root, k);
        return res;
    }
}