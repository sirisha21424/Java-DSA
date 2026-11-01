class Solution {
    public int houseRobber(int[] money) {
        int n=money.length;
        if(n==1)
            return money[0];
        int[] dp1=new int[n];
        dp1[0]=money[0];
        for(int i=1;i<n-1;i++)
        {   int take=money[i];
            if(i-2>=0)
            {   take+=dp1[i-2];
            }
            int nontake=dp1[i-1];
            dp1[i]=Math.max(take,nontake);
        }
        int[] dp2=new int[n];
        dp2[1]=money[1];
        for(int i=2;i<n;i++)
        {   int take=money[i];
            if(i-2>=1)
            {   take+=dp2[i-2];
            }
            int nontake=dp2[i-1];
            dp2[i]=Math.max(take,nontake);
        }
        return Math.max(dp1[n-2],dp2[n-1]);
        


    }
}