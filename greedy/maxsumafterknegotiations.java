import java.util.*;
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        while(k>0 && i<nums.length && nums[i]<0)
        {   
               nums[i]=-nums[i];
                k--;
                i++;
        }
        int min=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++)
        {   min=Math.min(min,nums[j]);
        }
       int tot=0;
        for(int j=0;j<nums.length;j++)
        {   tot+=nums[j];
        }
        if(k%2==1)
        {   tot-=2*min;
        }
        return tot;
        
    }
}