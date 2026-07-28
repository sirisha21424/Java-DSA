class Solution {
    public int numberOfOddSubarrays(int[] nums, int k) {
            return atMost(nums,k)-atMost(nums,k-1);
    }
    private int atMost(int[] nums, int goal)
     {
        int count=0;
        int l=0;
        int sum=0;
        for(int r=0;r<nums.length;r++)
        {   if(nums[r]%2!=0)
            {   count++;
            }
            while(count>goal)
            {   if(nums[l]%2!=0)
                {   count--;
                }
                l++;
            }
           sum+=r-l+1;
        }
        return sum;
    }
}