import java.util.*;
class Solution {
    public int spanningTree(int V, List<List<List<Integer>>> adj) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int[] visited=new int[V];
        int mindist=0;
        pq.offer(new int[]{0,0,-1});
        while(!pq.isEmpty())
        {   int[] curr=pq.poll();
            int node=curr[1];
            int dist=curr[0];
            if(visited[node]!=1)
            {   visited[node]=1;
                mindist+=dist;
                for(int i=0;i<adj.get(node).size();i++)
                {   int n=adj.get(node).get(i).get(0);
                    int w=adj.get(node).get(i).get(1);
                    if(visited[n]==0)
                    {   pq.offer(new int[]{w,n,node});
                    }
                }
            }
        }
        return mindist;
        
    }
}

