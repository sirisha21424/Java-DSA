class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        //your code goes here
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty())
        {   int size=que.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++)
            {   TreeNode node=que.poll();
                level.add(node.data);
                if(node.left!=null)
                    que.offer(node.left);
                if(node.right!=null)
                    que.offer(node.right);
            }
            ans.add(level);

        }
        return ans;

        
    }
}
