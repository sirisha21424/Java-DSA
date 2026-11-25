class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int j=0;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {   sum+=arr[i];
            if(i-j+1==k)
            {   int avg=sum/k;
                if(avg>=threshold)
                {   count++;
                }
                sum-=arr[j];
                j++;
            }
        }
        return count;
    }
}