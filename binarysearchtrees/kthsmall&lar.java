import java.util.*;
class Solution {
    public List<Integer> kLargesSmall(TreeNode root, int k) {
        //your code goes here
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
        int n=list.size();
        List<Integer> ans=new ArrayList<>();
        ans.add(list.get(k-1));
        ans.add(list.get(n-k));
        return ans;
    }
    public void inorder(TreeNode root,List<Integer> list)
    {   if(root==null)
            return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
}