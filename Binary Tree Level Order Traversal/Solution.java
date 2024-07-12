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
    private void levelHelper(TreeNode rt, int cr, Map<Integer, List<Integer>> mp) {
        if (rt == null) return;

        List<Integer> list;
        if (!mp.containsKey(cr)) list = new ArrayList<>();
        else list = mp.get(cr);
        list.add(rt.val);
        mp.put(cr, list);

        levelHelper(rt.left, cr + 1, mp);
        levelHelper(rt.right, cr + 1, mp);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        List<List<Integer>> output = new ArrayList<>();
        levelHelper(root, 0, mp);
        for (int key : mp.keySet()) output.add(mp.get(key));
        return output;
    }
}