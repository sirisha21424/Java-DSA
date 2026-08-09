import java.util.*;
class Solution {
    public int countNodes(TreeNode root) {
        //your code goes here
        int count=0;
        if(root==null)
            return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {   int size=q.size();
            count+=size;
            for(int i=0;i<size;i++)
            {   TreeNode node=q.poll();
                if(node.left!=null)
                    q.offer(node.left);
                if(node.right!=null)
                    q.offer(node.right);
            }
        }
        return count;
    }
}