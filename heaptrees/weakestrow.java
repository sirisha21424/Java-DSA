import java.util.*;
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
       PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> {
        
        if (a[0] != b[0])
            return Integer.compare(a[0], b[0]);
        return Integer.compare(a[1], b[1]);
    }
);
        for(int i=0;i<n;i++)
        {   int count=0;
            for(int j=0;j<m;j++)
            {  if(mat[i][j]==1)
                {   count++;
                }
            }
            pq.offer(new int[]{count,i});
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++)
        {   int[] arr1=pq.poll();
            int index=arr1[1];
            arr[i]=index;
        }
        return arr;


        
    }
}