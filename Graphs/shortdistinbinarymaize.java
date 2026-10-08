import java.util.*;
class Solution {
    int shortestPath(int[][] grid, int[] source, int[] destination) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] visited=new int[n][m];
        int inf=Integer.MAX_VALUE;
        int row=destination[0];
        int col=destination[1];
       for(int i = 0; i < n; i++) {
            Arrays.fill(visited[i], inf);
        }
        int a=source[0];
        int b=source[1];
        visited[a][b]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((e,f)->e[0]-f[0]);
        pq.offer(new int[]{0,a,b});
        while(!pq.isEmpty())
        {   int[] curr=pq.poll();
            int r=curr[1];
            int c=curr[2];
            for(int i=r-1;i<=r+1;i++)
            {   for(int j=c-1;j<=c+1;j++)
                {   if(i>=0 && i<n && j>=0 && j<m &&(i==r || j==c))
                    {   if(grid[i][j]==1)
                        {   if(visited[i][j]>curr[0]+1)
                            {   visited[i][j]=curr[0]+1;
                                pq.offer(new int[]{ visited[i][j],i,j});
                            }
                        }
                    }
                }
            }
        }
        if(visited[row][col]==inf)
            return -1;
        return visited[row][col];


    }
}