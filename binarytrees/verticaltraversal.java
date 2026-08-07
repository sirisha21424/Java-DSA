import java.util.*;
class Solution {
        class Pair {
        TreeNode node;
        int hd;

        Pair(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        //your code goes here
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty())
        {   Pair curr = q.poll();
            TreeNode node=curr.node;
            int hd = curr.hd;
            if (!map.containsKey(hd)) {
                map.put(hd, new ArrayList<>());
            }
            map.get(hd).add(node.data);
            if (node.left != null) {
                q.offer(new Pair(node.left, hd - 1));
            }
            if (node.right != null) {
                q.offer(new Pair(node.right, hd + 1));
            }

        }
        for (List<Integer> list : map.values()) {
            ans.add(list);
        }
        return ans;



    }   
}