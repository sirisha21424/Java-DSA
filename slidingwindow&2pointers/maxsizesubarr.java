class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minlen=Integer.MAX_VALUE;
        int j=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {   sum+=nums[i];
            while(sum>=target)
            {   minlen=Math.min(minlen,i-j+1);
                sum-=nums[j];
                j++;
            }
        }
        if(minlen==Integer.MAX_VALUE)
        {   return 0;
        }
        return minlen;
        
    }
}