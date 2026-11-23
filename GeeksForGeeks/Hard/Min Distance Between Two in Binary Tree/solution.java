/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    Node lca(Node root, int a, int b) {
        if (root == null || root.data == a || root.data == b)
            return root;

        Node left = lca(root.left, a, b);
        Node right = lca(root.right, a, b);

        if (left != null && right != null)
            return root;

        return left != null ? left : right;
    }

    int dist(Node root, int val) {
        if (root == null)
            return -1;

        if (root.data == val)
            return 0;

        int left = dist(root.left, val);
        if (left != -1)
            return left + 1;

        int right = dist(root.right, val);
        if (right != -1)
            return right + 1;

        return -1;
    }

    int findDist(Node root, int a, int b) {
        if (a == b)
            return 0;

        Node LCA = lca(root, a, b);

        return dist(LCA, a) + dist(LCA, b);
    }
}