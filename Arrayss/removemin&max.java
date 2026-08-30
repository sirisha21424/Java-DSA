class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minindex=0;
        int maxindex=0;
        for(int i=1;i<n;i++)
        {   if(nums[i]<nums[minindex])
            {   minindex=i;
            }
            if(nums[i]>nums[maxindex])
            {   maxindex=i;
            }
        }
        int left=Math.min(minindex,maxindex);
        int right=Math.max(minindex,maxindex);
        int opt1=right+1;
        int opt2=n-left;
        int opt3=(left+1)+(n-right);
        return Math.min(opt1,Math.min(opt2,opt3));

        
    }
}