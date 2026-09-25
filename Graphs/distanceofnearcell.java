class Solution {
    public int[][] nearest(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(grid[i][j]==0)
                {   ans[i][j]=finddistance(grid,i,j);
                }
                else
                {   ans[i][j]=0;
                }
            }
        }
        return ans;
       
    }
    public int finddistance(int[][] grid,int r,int c)
    {   int distance=Integer.MAX_VALUE;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(grid[i][j]==1)
                {   int d=Math.abs(i-r)+Math.abs(j-c);
                    distance=Math.min(distance,d);
                }
            }
        }
        return distance;
    }
}