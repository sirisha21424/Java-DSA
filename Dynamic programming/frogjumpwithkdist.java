class Solution {
    public int frogJump(int[] heights, int k) {
        int n=heights.length;
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++)
        {   int j=1;
            int dpi=Integer.MAX_VALUE;
            while(j<=k)
            {   int cost=0;
                if(i-j>=0)
                {   cost=dp[i-j]+Math.abs(heights[i]-heights[i-j]);
                    dpi=Math.min(dpi,cost);
                }
                j++;
            }
            dp[i]=dpi;
        }
        return dp[n-1];


    }
}