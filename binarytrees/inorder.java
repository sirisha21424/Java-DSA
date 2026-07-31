import java.util.*; 
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public List<Integer> inorder(TreeNode root) {
        //your code goes here
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null || stack.size()>0)
        {   while(root!=null)
            {   stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            list.add(root.data);
            root=root.right;
        }
        return list;
    }
}
