class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        //your code goes here
        int n=preorder.length;
        TreeNode root=new TreeNode(preorder[0]);
        TreeNode curr=root;
        for(int i=1;i<n;i++)
        {   curr=root;
            while(true)
            {   if(curr.data>preorder[i])
                {   if(curr.left==null)
                    {   curr.left=new TreeNode(preorder[i]);
                        break;
                    }
                    curr=curr.left;
                }
                else
                {   if(curr.right==null)
                    {   curr.right=new TreeNode(preorder[i]);
                        break;
                    }
                    curr=curr.right;
                }
            }
        }
        return root;

    }
}