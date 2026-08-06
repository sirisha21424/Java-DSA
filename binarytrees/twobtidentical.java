class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //your code goes here
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        boolean l=isSameTree(p.left,q.left);
        boolean r=isSameTree(p.right,q.right);
        return p.data==q.data && l && r;

    }
}
