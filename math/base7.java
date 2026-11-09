class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb=new StringBuilder();
        if(num==0)
            return "0";
        int n=Math.abs(num);
        while(n>0)
        {   int r=n%7;
            sb.append(r);
            n=n/7;
        }
        StringBuilder sb1=new StringBuilder();
        sb1=sb.reverse();
        if(num<0)
        {   sb1.insert(0,'-');
        }  
        return sb1.toString();      
    }
}