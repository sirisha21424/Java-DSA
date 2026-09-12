import java.util.*;
class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here
        Arrays.sort(Arrival);
        Arrays.sort(Departure);
        int i=0;
        int j=0;
        int count=0;
        int max=0;
        while(i<Arrival.length)
        {   if(Arrival[i]<Departure[j])
            {   count++;
                i++;
                max=Math.max(count,max);
            }
            else
            {   count--;
                j++;
            }
        }
        return max;
    }
}