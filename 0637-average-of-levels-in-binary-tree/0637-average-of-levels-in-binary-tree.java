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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        dfs(root, 0, list);
        List<Double> ans = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            double sum = 0;
            for (int j = 0; j < list.get(i).size(); j++) {
                sum += list.get(i).get(j);
            }
            ans.add(sum / list.get(i).size());
        }
        return ans;
    }
    void dfs(TreeNode root, int level,ArrayList<ArrayList<Integer>> list) {
        if (root == null) {
            return;
        }
        if (level == list.size()) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        dfs(root.left, level + 1, list);
        dfs(root.right, level + 1, list);
    }
}