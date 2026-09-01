import java.util.*;
class Solution {
    public int[] maxSumCombinations(int[] nums1, int[] nums2, int k) {
        int[] arr=new int[k];
        int n=nums1.length;
        int m=nums2.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
        {   for(int j=0;j<m;j++)
            {   pq.offer(nums1[i]+nums2[j]);
            }
        }
        for(int i=0;i<k;i++)
        {   arr[i]=pq.poll();
        }
        return arr;

    }
}