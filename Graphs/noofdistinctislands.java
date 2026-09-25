import java.util.*;
class Solution {
    HashSet<Integer> set=new HashSet<>();
    public int countDistinctIslands(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] visited=new int[n][m];
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(grid[i][j]==1 && visited[i][j]!=1)
                {   bfs(grid,visited,i,j);
                }
            }
        }
        return set.size();

      
    }
    public void bfs(int[][] grid,int[][] visited,int r,int c)
    {   int n=grid.length;
        int m=grid[0].length;
        visited[r][c]=1;
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{r,c});
        StringBuilder shape = new StringBuilder();
        while(!q.isEmpty())
        {   int[] curr=q.poll();
            int row=curr[0];
            int col=curr[1];
            shape.append(row - r);
            shape.append(",");
            shape.append(col - c);
            shape.append(";");

            for(int i=row-1;i<=row+1;i++)
            {   for(int j=col-1;j<=col+1;j++)
                {   if(i>=0 && i<n && j>=0 && j<m && (i==row || j==col)&& visited[i][j]!=1 && grid[i][j]==1)
                    {   visited[i][j]=1;
                        q.offer(new int[]{  i,j});
                    }
                }
            }

        }
        set.add(shape.toString());

    }
}
