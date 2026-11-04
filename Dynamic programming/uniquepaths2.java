class Solution {
    public int uniquePathsWithObstacles(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        if(matrix[0][0]==0)
            dp[0][0]=1;
        else
            dp[0][0]=0;
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(i==0 && j==0 && matrix[0][0]==0)
                {   dp[0][0]=1;
                }
                else
                {   int left=0;
                    int up=0;
                    if(j-1>=0 && matrix[i][j]==0)
                    {   left=dp[i][j-1];
                    }
                    if(i-1>=0 && matrix[i][j]==0)
                    {   up=dp[i-1][j];
                    }
                    dp[i][j]=left+up;
                }
            }
        }
        return dp[n-1][m-1];
    }
}