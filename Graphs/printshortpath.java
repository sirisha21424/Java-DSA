import java.util.*;
class Solution {
    public List<Integer> shortestPath(int n, int m, int[][] edges) {
        List<List<int[]>> list=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {   list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {   int k=edges[i][0];
            int l=edges[i][1];
            int wt=edges[i][2];
            list.get(k).add(new int[]{l,wt});
            list.get(l).add(new int[]{k,wt});
        }
        int[] dist=new int[n+1];
        int inf = (int)1e9;
        Arrays.fill(dist,inf);
        int[] parent = new int[n+1];
        for(int i = 1; i <= n; i++)
        {
            parent[i] = i;
        }
        dist[1]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,1});
        while(!pq.isEmpty())
        {   int[] curr=pq.poll();
            int node=curr[1];
            for(int i=0;i<list.get(node).size();i++)
            {   int[] c=list.get(node).get(i);
                if(dist[c[0]]>curr[0]+c[1])
                {   dist[c[0]]=curr[0]+c[1];
                    parent[c[0]]=node;
                    pq.offer(new int[]{ curr[0]+c[1],c[0]});
                }
            }
        }
        List<Integer> path = new ArrayList<>();
        int node=n;
        while(parent[node]!=node)
        {   path.add(node);
           
            node=parent[node];
        }
        path.add(1);
        path.add(dist[n]);

        Collections.reverse(path);
        return path;
     
    }
}
