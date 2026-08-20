import java.util.*;
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n=points.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0]));

        
        for(int i=0;i<n;i++)
        {   int x=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.offer(new int[]{x,i});
        }
        int l=0;
        int [][] arr=new int[k][2];
        while(l<k)
        {   int index = pq.poll()[1];

            arr[l][0] = points[index][0];
            arr[l][1] = points[index][1];
            l++;
        }
        return arr;
    }
}