class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        //your code goes here
        if(root==null)
            return null;
        if(root.data>key)
        {   root.left=deleteNode(root.left,key);
        }
        else if(root.data<key)
        {   root.right=deleteNode(root.right,key);
        }
        else
        {   if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;
            TreeNode successor=root.right;
            while(successor.left!=null)
            {   successor=successor.left;
            }
            root.data=successor.data;
            root.right=deleteNode(root.right,successor.data);
        }
        return root;

    }
}