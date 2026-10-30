class Solution {
    public int frogJump(int[] heights) {
        int n=heights.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<n;i++)
        {   int first=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            int second=Integer.MAX_VALUE;
            if(i>1)
            {   second=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            }
            dp[i]=Math.min(first,second);
        }
        return dp[n-1];
    }
}