import java.util.*;
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] visited=new int[n][m];
        int area=0;
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(grid[i][j]==1 && visited[i][j]!=1 )
                {   area=Math.max(area,bfs(i,j,grid,visited));
                }
            }
        }
        return area;

        
    }
    public int bfs(int r,int c,int[][] grid,int[][] visited)
    {   Queue<int[]> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        q.offer(new int[]{r,c});
        int a=0;
        while(!q.isEmpty())
        {   int[] curr=q.poll();
            int row=curr[0];
            int col=curr[1];
            for(int i=row-1;i<=row+1;i++)
            {   for(int j=col-1;j<=col+1;j++)
                {   if(i>=0 && i<n && j>=0 && j<m && (i==row || j==col))
                    {   if(grid[i][j]==1 && visited[i][j]!=1)
                        {   visited[i][j]=1;
                            a+=1;
                            q.offer(new int[]{i,j});
                        }
                    }
                }
            }
        }
        return a;
    }

}