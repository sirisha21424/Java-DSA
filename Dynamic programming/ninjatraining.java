class Solution {
    public int ninjaTraining(int[][] matrix) {
       int n=matrix.length;
       int[][] dp=new int[n][4];
       dp[0][0] = Math.max(matrix[0][1], matrix[0][2]);
       dp[0][1] = Math.max(matrix[0][0], matrix[0][2]);
       dp[0][2] = Math.max(matrix[0][0], matrix[0][1]);
       dp[0][3] = Math.max(matrix[0][0],
                    Math.max(matrix[0][1], matrix[0][2]));
        for(int day=1;day<n;day++)
        {   for(int last=0;last<4;last++)
            {   int maxpoints=0;
                for(int i=0;i<3;i++)
                {   if(i!=last)
                    {   int points=matrix[day][i]+dp[day-1][i];
                        maxpoints=Math.max(maxpoints,points);
                    }
                }
                dp[day][last]=maxpoints;
            }
        }
        return dp[n-1][3];

    }
}