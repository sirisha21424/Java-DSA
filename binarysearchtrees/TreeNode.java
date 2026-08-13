import java.util.*;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Solution {
    public TreeNode lca(TreeNode root, int p, int q) {

        while (root != null) {

            // Both p and q are in the left subtree
            if (p < root.data && q < root.data) {
                root = root.left;
            }

            // Both p and q are in the right subtree
            else if (p > root.data && q > root.data) {
                root = root.right;
            }

            // They split at root, or root is p/q
            else {
                return root;
            }
        }

        return null;
    }
}