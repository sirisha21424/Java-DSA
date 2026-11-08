class Solution {
    public int stockBuySell(int[] arr, int n) {
        int minprice=arr[0];
        int maxx=0;
        for(int i=0;i<n;i++)
        {   if(minprice>arr[i])
            {   minprice=arr[i];
            }
            int profit=arr[i]-minprice;
            maxx=Math.max(profit,maxx);
        }
       return maxx;
    }
    
}