class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // Your code goes here
        return atmost(nums,k)- atmost(nums,k-1);
    }
    private int atmost(int []nums,int goal)
    {   if(goal<0)
        {   return 0;
        }
        int l=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<nums.length;r++)
        {   map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>goal)
            {   map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0)
                {   map.remove(nums[l]);
                }
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }
}