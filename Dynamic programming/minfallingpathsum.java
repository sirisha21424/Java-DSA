class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        for(int i=0;i<m;i++)
        {   dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   int bt=Integer.MAX_VALUE;
                int btr=Integer.MAX_VALUE;
                int btl=Integer.MAX_VALUE;
                if(i-1>=0)
                {   bt=dp[i-1][j]+matrix[i][j];
                }
                if(i-1>=0 && j-1>=0)
                {   btl=dp[i-1][j-1]+matrix[i][j];
                }
                if(i-1>=0 && j+1<m)
                {   btr=dp[i-1][j+1]+matrix[i][j];
                }
                dp[i][j]=Math.min(bt,Math.min(btr,btl));
            }

            
        }
        int mindistance=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {   if(mindistance>dp[n-1][i])
            {   mindistance=dp[n-1][i];
            }
        }
        return mindistance;
        

    }
}