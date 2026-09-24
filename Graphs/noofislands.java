import java.util.*;
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] visited=new int[n][m];
        int count=0;
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(visited[i][j]==0 && grid[i][j]=='1')
                {  
                    bfs(grid,visited,i,j);
                    count++;
                }
            }
        }
        return count;
        
        
    }
    public void bfs(char[][] grid,int[][] visited,int r,int c)
    {   visited[r][c]=1;
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{r,c});
        int n=grid.length;
        int m=grid[0].length;
        while(!q.isEmpty())
        {   int[] curr=q.poll();
            int row=curr[0];
            int col=curr[1];
            for(int i=row-1;i<=row+1;i++)
            {   for(int j=col-1;j<=col+1;j++)
                {   if(i>=0 && i<n && j>=0 && j<m && visited[i][j]==0 && grid[i][j]=='1' &&(i==row || j==col))
                    {   visited[i][j]=1;
                        q.offer(new int[]{i,j});
                    }
                }
            }
        }
    }
}