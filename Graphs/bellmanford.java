import java.util.*;
class Solution {
    static int[] bellman_ford(int V,
                              ArrayList<ArrayList<Integer>> edges, int S) {
        int[] dist = new int[V];
        int INF = 1000000000;
        Arrays.fill(dist, INF);
        dist[S] = 0;
        for(int j=0;j<V-1;j++)
        {   for(int i=0;i<edges.size();i++)
            {   int u=edges.get(i).get(0);
                int v=edges.get(i).get(1);
                int w=edges.get(i).get(2);
                if(dist[u]!=INF && dist[v]>dist[u]+w)
                {   dist[v]=dist[u]+w;
                }
            }
        }
        for(int i=0;i<edges.size();i++)
        {   int u=edges.get(i).get(0);
            int v=edges.get(i).get(1);
            int w=edges.get(i).get(2);
            if(dist[u]!=INF && dist[v]>dist[u]+w)
            {   return new int[]{-1};
            }
        }
        return dist;
        

            
    
    }
}