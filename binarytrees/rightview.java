import java.util.*;
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        //your code goes here
        List<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {   int size = q.size();
            for(int i=0;i<size;i++)
            {   TreeNode node=q.poll();
                if(i==size-1)
                    list.add(node.data);
                if(node.left!=null)
                    q.offer(node.left);
                if(node.right!=null)
                    q.offer(node.right);
            }
        }
        return list;

    }
}