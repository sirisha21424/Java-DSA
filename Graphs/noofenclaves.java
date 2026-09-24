import java.util.*;
class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(i==0 || i==n-1 || j==0 || j==m-1)
                {   if(grid[i][j]==1)
                    {   q.offer(new int[]{ i,j });
                    }
                }
            }
        }
        int[][] visited=new int[n][m];
        while(!q.isEmpty())
        {   int[] curr=q.poll();
            int r=curr[0];
            int c=curr[1];
            for(int i=r-1;i<=r+1;i++)
            {   for(int j=c-1;j<=c+1;j++)
                {   if(i>=0 && i<n && j>=0 && j<m && (i==r || j==c))
                    {   if(grid[i][j]==1 && visited[i][j]==0)
                        {   visited[i][j]=1;
                            q.offer(new int[]{  i,j});
                        }
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(grid[i][j]==1 && visited[i][j]==0)
                {   count++;
                }
            }
        }
        return count;
    }
}
