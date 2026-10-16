import java.util.*;
class Solution {
    public int swimInWater(int[][] grid) {
        // Your code goes here
        int n=grid.length;
        int m=grid[0].length;
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   dist[i][j]=Integer.MAX_VALUE;
            }
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{grid[0][0],0,0});
        dist[0][0]=0;
        while(!pq.isEmpty())
        {   int[] curr=pq.poll();
            int r=curr[1];
            int c=curr[2];
            if(r==n-1 && c==m-1)
                return curr[0];
            for(int i=r-1;i<=r+1;i++)
            {   for(int j=c-1;j<=c+1;j++)
                {   if(i>=0 && i<n && j>=0 &&j<m &&(i==r||j==c))
                    {   int newtime=Math.max(curr[0],grid[i][j]);
                        if(newtime<dist[i][j])
                        {  dist[i][j]=newtime;
                           pq.offer(new int[]{newtime,i,j});
                        }
                    }
                }
            }
        }
            return dist[n-1][m-1];
    }
}