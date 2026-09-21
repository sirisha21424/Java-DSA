import java.util.*;
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]>q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int fresh=0;
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(grid[i][j]==2)
                {   q.offer(new int[]{i,j,});
                }
                if(grid[i][j]==1)
                {   fresh++;
                }
            }
        }
        int minutes = 0;

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };
        while(!q.isEmpty() && fresh>0)
        {   int size=q.size();
            for(int i=0;i<size;i++)
            {   int[] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                for(int j=0;j<directions.length;j++)
                {   int nr=r+directions[j][0];
                    int nc=c+directions[j][1];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1)
                    {   grid[nr][nc]=2;
                        fresh--;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
            minutes++;
        }
        if(fresh>0)
            return -1;
        return minutes;
        
        
    }
}