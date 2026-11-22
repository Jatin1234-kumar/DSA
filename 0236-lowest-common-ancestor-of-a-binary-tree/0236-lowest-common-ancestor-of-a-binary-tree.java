class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> arr1 = new ArrayList<>();
        ArrayList<TreeNode> arr2 = new ArrayList<>();
        storepath(root, p, arr1);
        storepath(root, q, arr2);
        TreeNode ans = null;
        for(int i = 0; i < Math.min(arr1.size(), arr2.size()); i++) {
            if(arr1.get(i) == arr2.get(i)) {
                ans = arr1.get(i);
            } else {
                break;
            }
        }
        return ans;
    }

    public boolean storepath(TreeNode root, TreeNode target, ArrayList<TreeNode> arr) {
        if(root == null) return false;
        arr.add(root);
        if(root == target) return true;
        if(storepath(root.left, target, arr) ||
           storepath(root.right, target, arr)) {
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;
    }
}