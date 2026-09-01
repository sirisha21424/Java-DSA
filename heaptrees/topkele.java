import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Your code goes here
        int[] arr=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {   map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
            );
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {   pq.offer(entry);
            if(pq.size()>k)
            {   pq.poll();
            }
        }
        for(int i=0;i<k;i++)
        {   arr[i]=pq.poll().getKey();
        }
        return arr; 

    }
}