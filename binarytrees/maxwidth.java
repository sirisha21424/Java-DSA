import java.util.*;
class Solution {
    class Pair {
    TreeNode node;
    int index;   

    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
    }
    public int widthOfBinaryTree(TreeNode root) {
        //your code goes here
        if(root==null)
            return 0;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        int width=0;
        while(!q.isEmpty())
        {   int size=q.size();
            int first=q.peek().index;
            int last=first;
            for(int i=0;i<size;i++)
            {   Pair p=q.poll();
                TreeNode node=p.node;
                int n=p.index;
                last=n;
                if(node.left!=null)
                    q.offer(new Pair(node.left,2*n+1));
                if(node.right!=null)
                    q.offer(new Pair(node.right,2*n+2));

            
                
            }
            width=Math.max(width,last-first+1);
        
        }
        return width;


    }
}