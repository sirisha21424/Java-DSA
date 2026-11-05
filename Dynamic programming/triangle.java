class Solution {
    public int minTriangleSum(int[][] triangle) {
        int n=triangle.length;
        int m=triangle[n-1].length;
        int[][] dp=new int[n][m];
        dp[0][0]=triangle[0][0];
        for(int i=0;i<n;i++)
        {   for(int j=0;j<i+1;j++)
            {   if(i==0 && j==0)
                {   dp[0][0]=triangle[0][0];
                }
                else
                {   int bt=Integer.MAX_VALUE;
                    int btr=Integer.MAX_VALUE;
                    if(i>j)
                    {   bt=dp[i-1][j]+triangle[i][j];
                    }
                    if(i-1>=0 && j-1>=0)
                    {   btr=dp[i-1][j-1]+triangle[i][j];
                    }
                    dp[i][j]=Math.min(bt,btr);
                }
            }
        }
        int mindist=Integer.MAX_VALUE;
        for(int i=0;i<m;i++)
        {   if(mindist>dp[n-1][i])
            {   mindist=dp[n-1][i];
            }
        }
        return mindist;

    }
}