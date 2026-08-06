import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //your code goes here
        int n=0;
        List<List<Integer>> ans =new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {   int size=que.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++)
            {   TreeNode node=que.poll();
                list.add(node.data);
                if(node.left!=null)
                    que.offer(node.left);
                if(node.right!=null)
                    que.offer(node.right);
            }
            if(n%2!=0)
            {   Collections.reverse(list);
            }
            ans.add(list);
            n++;
        }
        return ans;

    }
}