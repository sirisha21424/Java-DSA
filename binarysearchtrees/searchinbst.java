import java.util.*;
public class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode(int val) { data = val; left = null, right = null }
     }

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        //your code goes here
        if(root ==null)
            return null;
        if(root.data==val)
            return root;
        if(root.data>val)
        {
            return searchBST(root.left,val);
        }
        return searchBST(root.right,val);
        
    }
}
