class Solution {
    public int maxDepth(TreeNode root) {
        //your code goes here
        if (root==null)
            return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return 1+Math.max(l,r);

    }
}