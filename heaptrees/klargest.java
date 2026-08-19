import java.util.*;
class Solution {
    public int kthLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {   pq.offer(nums[i]);
            if(pq.size()>k)
            {   pq.poll();
            }
        }
        return pq.peek();



    }
}