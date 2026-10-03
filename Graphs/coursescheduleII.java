import java.util.*;
class Solution {
    public int[] findOrder(int N, int[][] arr) {
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
        int[] ans=new int[V];
        int l=0;
        while(!q.isEmpty())
        {   int node=q.poll();
            ans[l++]=node;
            for(int j=0;j<adj.get(node).size();j++)
            {   int k=adj.get(node).get(j);
                indegree[k]--;
                if(indegree[k]==0)
                {   q.offer(k);
                }
            }
        }
        if(l!=V)
            return new int[0];
        return ans;
            
        
       
    }
}