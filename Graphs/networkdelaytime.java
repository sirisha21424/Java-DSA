import java.util.*;
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> list=new ArrayList<>();
        for(int i=0;i<n+1;i++)
        {   list.add(new ArrayList<>());
        }
        int r=times.length;
        for(int i=0;i<r;i++)
        {   int l=times[i][0];
            int m=times[i][1];
            int w=times[i][2];
            list.get(l).add(new int[]{m,w});
        }
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0,k});
        while(!pq.isEmpty())
        {   int[] curr=pq.poll();
            int node=curr[1];
            int wt=curr[0];
            if(wt>dist[node])
                continue;
            for(int i=0;i<list.get(node).size();i++)
            {   int[] c=list.get(node).get(i);
                int neighbour=c[0];
                int w=c[1];
                if(dist[neighbour]>dist[node]+w)
                {   dist[neighbour]=dist[node]+w;
                    pq.offer(new int[]{dist[neighbour],neighbour});
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++)
        {   if(dist[i]==Integer.MAX_VALUE)
            {   return -1;
            }
            else
            {   max=Math.max(max,dist[i]);
            }
        }
        return max;
    }
}