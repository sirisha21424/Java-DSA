class Solution {
    public boolean canJump(int[] nums) {
        //your code goes here
           int maxindex=0;
    for(int i=0;i<nums.length;i++)
    {   if(i>maxindex)
        {   return false;
        }
        maxindex=Math.max(maxindex,i+nums[i]);
    }
    return true;
    }
}