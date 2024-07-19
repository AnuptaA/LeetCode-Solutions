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
    private void addNum(TreeNode node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        addNum(node.left, list);
        addNum(node.right, list);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        addNum(root, list);
        Collections.sort(list);
        return list.get(k - 1);
    }
}