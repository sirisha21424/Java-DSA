class Solution {
    public boolean isSymmetric(TreeNode root) {
        //your code goes here
        if(root==null)
            return true;
        return ismirror(root.left,root.right);

    }
    private boolean ismirror(TreeNode left,TreeNode right)
    {   if(left==null && right==null)
            return true;
        if(left==null || right==null)
            return false;
        if(left.data!=right.data)
            return false;
        return ismirror(left.left,right.right) && ismirror(left.right,right.left);
    }
}