import java.util.*;
class Solution {
    public boolean canFinish(int N, int[][] arr) {
      List<List<Integer>> adj=new ArrayList<>();
        int V=N;
        for(int i=0;i<V;i++)
        {   adj.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++)
        {   int k=arr[i][0];
            int l=arr[i][1];
            adj.get(l).add(k);
        }
        int[] indegree=new int[V];
        for(int i=0;i<V;i++)
        {   for(int j=0;j<adj.get(i).size();j++)
            {   int k=adj.get(i).get(j);
                indegree[k]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++)
        {   if(indegree[i]==0)
            {   q.offer(i);
            }
        }
        List<Integer> list=new ArrayList<>();
        while(!q.isEmpty())
        {   int node=q.poll();
            list.add(node);
            for(int j=0;j<adj.get(node).size();j++)
            {   int k=adj.get(node).get(j);
                indegree[k]--;
                if(indegree[k]==0)
                {   q.offer(k);
                }
            }
        }
        if(list.size()==V)
            return true;
        return false;
        
    }
}