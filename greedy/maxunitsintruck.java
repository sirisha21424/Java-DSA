import java.util.*;
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n=boxTypes.length;
        int count=0;
        int tot=0;
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        for(int i=0;i<n;i++)
        {  
           if(count+boxTypes[i][0]<=truckSize)
           {    tot+=boxTypes[i][0]*boxTypes[i][1];
                count+=boxTypes[i][0];
           }
           else
           {   if(truckSize-count>0)
               {    int rem=truckSize-count;
                    tot+=rem*boxTypes[i][1];
                    return tot;
               }
           }
        }
        return tot;
    }
}