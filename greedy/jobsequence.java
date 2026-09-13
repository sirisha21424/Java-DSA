import java.util.*;
class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        Arrays.sort(Jobs,(a,b)->b[2]-a[2]);
        int tot=0;
        int count=0;
        int maxdeadline=-1;
        for(int i=0;i<Jobs.length;i++)
        {   maxdeadline=Math.max(maxdeadline,Jobs[i][1]);
        }
        int[] arr=new int[maxdeadline+1];
        Arrays.fill(arr,-1);
        for(int i=0;i<Jobs.length;i++)
        {   int id=Jobs[i][0];
            int deadline=Jobs[i][1];
            int profit=Jobs[i][2];
            for(int j=deadline;j>=1;j--)
            {   if(arr[j]==-1)
                {   arr[j]=id;
                    count++;
                    tot+=profit;
                    break;
                }
            }
        }
        return new int[]{count,tot};
    }
}