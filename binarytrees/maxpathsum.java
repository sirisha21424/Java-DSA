class Solution {
    int maxsum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        //your code goes here 
        sum(root);
        return maxsum;
    }
    public int sum(TreeNode root)
    {   if (root == null)
            return 0;

        int l=Math.max(0,sum(root.left));
        int r=Math.max(0,sum(root.right));
        maxsum=Math.max(maxsum,l+r+root.data);
        return root.data+Math.max(l,r);

    }
}