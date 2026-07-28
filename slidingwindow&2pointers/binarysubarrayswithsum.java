class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    private int atMost(int[] nums, int goal) {
        if(goal<0)
            return 0;
        //your code goes here
        int maxlen=0;
        int total=0;
        int l=0;
        int count=0;
        for(int r=0;r<nums.length;r++)
        {   total+=nums[r];
            while(total>goal)
            {   if(nums[l]==1)
                {   total-=1;
                }
                l++;
            }
           count += (r- l + 1);
        }
        return count;
    }
}