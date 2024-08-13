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
    private List<List<Integer>> ps;
    private void backtrack(TreeNode node, List<Integer> list, int sum, int target) {
        if (node == null) return;
        sum = sum + node.val;
        list.add(node.val);

        if (sum == target){
            if (node.left == null && node.right == null) ps.add(new ArrayList<>(list));
        }
        backtrack(node.left, list, sum, target);
        backtrack(node.right, list, sum, target);
        list.remove(list.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ps = new ArrayList<>();
        backtrack(root, new ArrayList<>(), 0, targetSum);
        return ps;
    }
}