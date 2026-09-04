import java.util.*;
class Solution {
    public int halveArray(int[] nums) {
       PriorityQueue<Double> pq =
            new PriorityQueue<>((a, b) -> Double.compare(b, a));

        double tot=0;
        for(int i=0;i<nums.length;i++)
        {   pq.offer((double)nums[i]);
            tot+=nums[i];
        }
        double sum=tot;
        int count=0;
        while(pq.size()>0)
        {   double a=pq.poll()/2;
            sum-=a;
            count++;
            if(tot/2>=sum)
            {   return count;
            }
            pq.offer(a);
        }
        return -1;
        
    }
}