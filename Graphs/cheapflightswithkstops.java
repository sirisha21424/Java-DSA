import java.util.*;
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {   list.add(new ArrayList<>());
        }
        for(int i=0;i<flights.length;i++)
        {   int h=flights[i][0];
            int l=flights[i][1];
            int w=flights[i][2];
            list.get(h).add(new int[]{l,w});
        }
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,src,0});
        while(!q.isEmpty())
        {   int[] curr=q.poll();
            int node=curr[1];
            int stops=curr[0];
            int w=curr[2];
            for(int i=0;i<list.get(node).size();i++)
            {   int[] c=list.get(node).get(i);
                int adjnode=c[0];
                int weight=c[1];
                if(dist[adjnode]>w+weight && stops<=k)
                {   dist[adjnode]=w+weight;
                    q.offer(new int[]{stops+1,adjnode,w+weight});
                }
            }
        }
        if(dist[dst]==Integer.MAX_VALUE)
            return -1;
        return dist[dst];

        
    }
}