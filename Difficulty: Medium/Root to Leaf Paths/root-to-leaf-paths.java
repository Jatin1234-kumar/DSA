/* Definition for Node
class Node
{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<ArrayList<Integer>> paths(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        findPaths(root,path,result);
        return result;
        
    }
    public void findPaths(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result){
        if(root==null){
            return;
        }
        path.add(root.data);
        
        if (root.left == null && root.right == null) {
            result.add(new ArrayList<>(path));
        }
        
        findPaths(root.left,path,result);
        findPaths(root.right,path,result);
        path.remove(path.size() - 1);

    }
    
}