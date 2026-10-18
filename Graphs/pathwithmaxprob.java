import java.util.*;
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] dist=new double[n];
        Arrays.fill(dist,0.0);
        List<List<double[]>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {   list.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {   int u=edges[i][0];
            int v=edges[i][1];
            double w=succProb[i];
            list.get(u).add(new double[]{v,w});
            list.get(v).add(new double[]{u,w});
        }
         PriorityQueue<double[]> pq =
            new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        dist[start_node]=1.0;
        pq.offer(new double[]{1.0,start_node});
        while(!pq.isEmpty())
        {   double[] curr=pq.poll();
            double prob=curr[0];
            int node=(int)curr[1];
            if(end_node==node)
                return curr[0];
            for(int i=0;i<list.get(node).size();i++)
            {   double[] c=list.get(node).get(i);
                int next = (int) c[0];
                double edgeProb = c[1];
                if(prob*edgeProb>dist[next])
                {   dist[next]=prob*edgeProb;
                    pq.offer(new double[]{prob*edgeProb,next});
                }
            }
        }
        return 0;

        
    }
}