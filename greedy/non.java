import java.util.*;
class Solution {
    public int MaximumNonOverlappingIntervals(int[][] intervals) {
        //your code goes here
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int count=0;
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {   if(intervals[i][0]<end)
            {   count++;
            }
            else
            {   end=intervals[i][1];
            }
        }
        return count;

    }
}
