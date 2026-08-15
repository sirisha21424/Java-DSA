import java.util.*;
class Solution {
    public boolean twoSumBST(TreeNode root, int k) {
        //your code goes here
        List<Integer> list=new ArrayList<>();
        inorder(root,list);
       
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            int sum = list.get(i) + list.get(j);

            if (sum == k)
                return true;
            else if (sum < k)
                i++;
            else
                j--;
        }
        return false;
    }
    public void inorder(TreeNode root,List<Integer> list)
    {       if(root==null)
                return ;
            inorder(root.left,list);
            list.add(root.data);
            inorder(root.right,list);
    }  
}
        