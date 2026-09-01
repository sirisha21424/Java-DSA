import java.util.*;
class Solution {
    public int connectSticks(List<Integer> sticks) {
        // Your Code Goes Here  
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<sticks.size();i++)
        {   pq.offer(sticks.get(i));
        }
        int sum=0;
        while(pq.size()-1>0)
        {   int a=pq.poll();
            int b=pq.poll();
            sum=sum+a+b;
            pq.offer(a+b);

        }
        return sum;
    }
}
