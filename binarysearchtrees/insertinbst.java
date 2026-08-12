class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        //your code goes here
        if(root==null)
            return new TreeNode(val);
        TreeNode curr=root;
        while(true)
        {   if(curr.data>val)
            {   if(curr.left==null)
                {   curr.left=new TreeNode(val);
                    break;
                }
                curr=curr.left;
            }
            else
            {   if(curr.right==null)
                {   curr.right=new TreeNode(val);
                    break;
                }
                curr=curr.right;
            }
        }
        return root;
    }
}

