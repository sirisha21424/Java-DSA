class Solution {
    public int pascalTriangleI(int r, int c) {
        int product1=1;
        int pro2=1;
        for(int i=r-1;i>1;i--)
        {   product1*=i;
        }
        for(int j=c-1;j>1;j--)
        {   pro2*=j;
        }
        for(int k=r-c;k>1;k--)
        {   pro2*=k;
        }
        return product1/pro2;

    }
}
  