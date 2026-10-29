import java.util.*;
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        boolean [] visited=new boolean[n];
        int totdistance=0;
        for(int i=0;i<n;i++)
        {   int node=-1;
            for(int j=0;j<n;j++)
            {   if(!visited[j] && (node==-1 || dist[j]<dist[node]))
                {   node=j;
                }
            }
            visited[node]=true;
            totdistance+=dist[node];
        
        for (int k = 0; k < n; k++) {
                if (!visited[k]) {
                    int distance =
                        Math.abs(points[node][0] - points[k][0]) +
                        Math.abs(points[node][1] - points[k][1]);

                    dist[k] = Math.min(dist[k], distance);
                }
            }
        }
    return totdistance;
    
        
    }
}