import java.util.*;
class Solution {
    public int[] shortestPath(int[][] edges, int N, int M) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<N;i++)
        {   list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {   int k=edges[i][0];
            int l=edges[i][1];
            list.get(k).add(l);
            list.get(l).add(k);
        }
        int[] dist=new int[N];
        Arrays.fill(dist,-1);
        Queue<Integer> q=new LinkedList<>();
        dist[0]=0;
        q.offer(0);
        while(!q.isEmpty())
        {   int node=q.poll();
            for(int j=0;j<list.get(node).size();j++)
            {   int a=list.get(node).get(j);
                if(dist[a]==-1)
                {   dist[a]=dist[node]+1;
                    q.offer(a);
                }
            }
        }
        return dist;
        
 
    }
}
