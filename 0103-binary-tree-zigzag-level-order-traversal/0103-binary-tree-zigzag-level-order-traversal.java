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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        bfs(root,0,ans);
        for(int i=0;i<ans.size();i++){
            if(i%2!=0){
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
    public void bfs(TreeNode root, int level,List<List<Integer>> ans){
        if(root==null){
            return;
        }
        if(ans.size()==level){
            ans.add(new ArrayList<>());
        }
        ans.get(level).add(root.val);
        bfs(root.left,level+1,ans);
        bfs(root.right,level+1,ans);
    }
}