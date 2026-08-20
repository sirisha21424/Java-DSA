import java.util.*;
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<piles.length;i++)
        {   pq.offer(piles[i]);
        }
        int l=k;
        while(l>0)
        {   int d=pq.poll();
            int x= d/2;
            pq.offer(d-x);
            l--;
        }
        int count=0;
        while(pq.size()>0)
        {   count+=pq.poll();
        }
        return count;
        
        
    }
}