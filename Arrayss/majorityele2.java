class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int c1=0;
        int c2=0;
        int cand1=0;
        int cand2=0;
        for(int i=0;i<nums.length;i++)
        {   if(c1==0 && nums[i]!=cand2)
            {   cand1=nums[i];
                c1=1;
            }
            else if(c2==0 && nums[i]!=cand1)
            {   cand2=nums[i];
                c2=1;
            }
            else if(nums[i]==cand1)
            {   c1++;
            }
            else if(nums[i]==cand2)
            {   c2++;
            }
            else{   c1--;
                    c2--;
                }
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++)
        {   if(nums[i]==cand1)
            {   c1++;
            }
            else if(nums[i]==cand2)
            {   c2++;
            }
        }
        if(c1>nums.length/3)
        {
            list.add(cand1);
        }
        if(c2>nums.length/3)
        {    list.add(cand2);
        }
        return list;

        
    }
}