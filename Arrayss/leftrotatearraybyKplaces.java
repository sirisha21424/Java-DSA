class Solution {
    public void rotateArray(int[] nums, int k) {
        int n=nums.length;
        int index=0;
        k=k%n;
        int[] temp=new int[n];
        for(int i=k;i<n;i++)
        {   temp[index++]=nums[i];
        }
        for(int i=0;i<k;i++)
        {   temp[index++]=nums[i];
        }
        for(int i=0;i<n;i++)
        {   nums[i]=temp[i];
        }
        
    }
}
