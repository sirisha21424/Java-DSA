class Solution {
    public int stockBuySell(int[] arr, int n) {
        int profit=0;
        int maxprofit=0;
        int minprice=arr[0];
        for(int i=0;i<n;i++)
        {   if(arr[i]<minprice)
            {   minprice=arr[i];
            }
            profit=arr[i]-minprice;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;
       
    }
}