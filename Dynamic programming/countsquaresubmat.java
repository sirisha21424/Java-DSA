class Solution {
    public int countSquares(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   if(i==0 || j==0)
                {   dp[i][j]=matrix[i][j];
                }
                else
                {   if(matrix[i][j]==1)
                    {   int up=0;
                        int left=0;
                        int diagonal=0;
                        if(i-1>=0)
                        {   up=dp[i-1][j];
                        }
                        if(j-1>=0)
                        {   left=dp[i][j-1];
                        }
                        if(i-1>=0 && j-1 >=0)
                        {   diagonal=dp[i-1][j-1];
                        }
                        dp[i][j]=Math.min(up,Math.min(left,diagonal))+1;
                    }
                }
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   sum+=dp[i][j];
            }
        }
        return sum;
        
        
    }
}
