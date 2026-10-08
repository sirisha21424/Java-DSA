import java.util.*;
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1)
             return -1;
        int[][] visited=new int[n][m];
        int inf=Integer.MAX_VALUE;
        int row=n-1;
        int col=m-1;
       for(int i = 0; i < n; i++) {
            Arrays.fill(visited[i], inf);
        }
        int a=0;
        int b=0;
        visited[a][b]=1;
        PriorityQueue<int[]> pq=new PriorityQueue<>((e,f)->e[0]-f[0]);
        pq.offer(new int[]{1,a,b});
        while(!pq.isEmpty())
        {   int[] curr=pq.poll();
            int r=curr[1];
            int c=curr[2];
            for(int i=r-1;i<=r+1;i++)
            {   for(int j=c-1;j<=c+1;j++)
                {   if(i>=0 && i<n && j>=0 && j<m)
                    {   if(grid[i][j]==0)
                        {   if(visited[i][j]>curr[0]+1)
                            {   visited[i][j]=curr[0]+1;
                                pq.offer(new int[]{ visited[i][j],i,j});
                            }
                        }
                    }
                }
            }
        }
        if(visited[row][col] == inf)
            return -1;
        return visited[row][col];
        
        
    }
}