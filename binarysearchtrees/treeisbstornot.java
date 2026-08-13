class Solution {
    public boolean isBST(TreeNode root) {
        //your code goes here
        if(root==null)
            return true;
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        for(int i=0;i<list.size()-1;i++)
        {   if(list.get(i)>list.get(i+1))
            {   return false;
            }
        }
        return true;        
    }
    public void inorder(TreeNode root,List<Integer> list)
    {   if(root==null)
            return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
}