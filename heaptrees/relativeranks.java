import java.util.*;
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String[] arr=new String[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> Integer.compare(b[0], a[0]));
    for(int i=0;i<score.length;i++)
    {   pq.offer(new int[]{score[i],i});
    }
    int i=1;
    while(pq.size()>0)
    {   int[] top=pq.poll();
        int index=top[1];
        if(i==1)
        {   arr[index]="Gold Medal";
        }
        else if(i==2)
        {   arr[index]="Silver Medal";
        }
        else if(i==3)
        {   arr[index]="Bronze Medal";
        }
        else
        {   arr[index]=String.valueOf(i);
        }
        i++;
    }
    return arr;
        
    }
}