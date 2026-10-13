import java.util.*;
class Solution {
    public int countPaths(int n, List<List<Integer>> roads) {
         int mod = 1_000_000_007;
        List<List<int[]>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {   list.add(new ArrayList<>());
        }
        for(int i=0;i<roads.size();i++)
        {   int k=roads.get(i).get(0);
            int l=roads.get(i).get(1);
            int w=roads.get(i).get(2);
            list.get(k).add(new int[]{ l,w });
            list.get(l).add(new int[]{k,w});
        }
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        int[] ways=new int[n];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Long.compare(a[0],b[0]));
        pq.offer(new int[]{0,0});
        dist[0]=0;
        ways[0]=1;
        while(!pq.isEmpty())
        {   int[] curr=pq.poll();
            int node=(int)curr[1];
            int dis=curr[0];
            for(int i=0;i<list.get(node).size();i++)
            {   int[] c=list.get(node).get(i);
                int neighbour=(int)c[0];
                int w=c[1];
                if(dist[neighbour]>w+dis)
                {   dist[neighbour]=w+dis;
                    ways[neighbour]=ways[node];
                    pq.offer(new int[]{dist[neighbour],neighbour});
                }
                else if(dist[neighbour]==w+dis)
                {   ways[neighbour]=(ways[neighbour]+ways[node])%mod;
                }

            }
        }
        return ways[n-1];


    }
}
