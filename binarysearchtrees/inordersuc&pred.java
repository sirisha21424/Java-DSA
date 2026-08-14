import java.util.*;
class Solution {
    List<Integer> succPredBST(TreeNode root, int key) {
        //your code goes here
        List<Integer> list= new ArrayList<>();
        inorder(root,list);
        int n=list.size();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {   if(list.get(i)==key)
            {   if(i-1 >= 0)
                {   ans.add(list.get(i-1));
                }
                else
                {   ans.add(-1);   
                }
                if(i+1<n)
                {   ans.add(list.get(i+1));
                }
                else
                {   ans.add(-1);
                }
            }
        }
        return ans;

    }
    public void inorder(TreeNode root,List<Integer> list)
    {   if(root==null)
            return ;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);

    }
}