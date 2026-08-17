class Solution {
    public boolean isHeap(int[] nums) {
        for(int i=0;i<nums.length/2;i++)
        {   int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (left < nums.length && nums[i] > nums[left]) {
                return false;
            }
            if (right < nums.length && nums[i] > nums[right]) {
                return false;
            }

        }
        return true;


    }
}
