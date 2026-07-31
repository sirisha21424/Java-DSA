import java.util.*;
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

class Solution {
    public List<Integer> preorder(TreeNode root) {
        //your code goes here
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(root!=null || stack.size()>0)
        {   while(root!=null)
            {   list.add(root.data);
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            root=root.right;
        }
        return list;
    }
}
