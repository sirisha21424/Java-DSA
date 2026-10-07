import java.util.*;
class Solution
{
    public  int[] dijkstra(int V, ArrayList<ArrayList<Integer>> edges, int S)
    {   
       List<List<int[]>> list=new ArrayList<>();
       for(int i=0;i<V;i++)
       {    list.add(new ArrayList<>());
       }
       for(int i=0;i<edges.size();i++)
       {    int k=edges.get(i).get(0);
            int l=edges.get(i).get(1);
            int wt=edges.get(i).get(2);
            list.get(k).add(new int[]{l,wt});
            list.get(l).add(new int[]{k,wt});
       }
       int[] dist=new int[V];
       int inf = (int)1e9;
       Arrays.fill(dist,inf);
       dist[S]=0;
       PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
       pq.offer(new int[]{0,S});
       while(!pq.isEmpty())
       {    int[] curr=pq.poll();
            int node=curr[1];
            for(int i=0;i<list.get(node).size();i++)
            {   int[] c=list.get(node).get(i);
                if(curr[0]+c[1]<dist[c[0]])
                {   dist[c[0]]=curr[0]+c[1];
                    pq.offer(new int[]{ dist[c[0]],c[0]});
                }
            }
        }
        return dist;

    }
}