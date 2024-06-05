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
    private Map<Integer, List<Double>> levTracker;
    private void dfs(TreeNode node, int height) {
        if (node == null) return;

        int currHeight = height + 1;
        List<Double> levList;
        if (levTracker.containsKey(currHeight)) levList = levTracker.get(currHeight);
        else levList = new ArrayList<>();

        levList.add((double)node.val);
        levTracker.put(currHeight, levList);

        dfs(node.left, currHeight);
        dfs(node.right, currHeight);
    }
    public List<Double> averageOfLevels(TreeNode root) {
        levTracker = new HashMap<>();
        dfs(root, 0);

        List<Double> output = new ArrayList<>();

        for (int key : levTracker.keySet()) {
            double sum = 0;
            List<Double> levList = levTracker.get(key);

            for (int i = 0; i < levList.size(); i++) sum += levList.get(i);
            
            double average = sum / (double) levList.size();
            output.add(average);
        }
        return output;
    }
}