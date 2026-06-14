class Solution {
    public void rotateArrayByOne(int[] nums) {
        int x=nums[0];
        int n=nums.length-1;
        for(int i=1;i<nums.length;i++)
        {   nums[i-1]=nums[i];
        }
        nums[n]=x;
        
    }
}