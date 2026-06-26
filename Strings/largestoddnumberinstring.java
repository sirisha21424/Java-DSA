class Solution {    
    public String largeOddNum(String s) {
        //your code goes here
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>0 && sb.charAt(0)=='0')
        {   sb.deleteCharAt(0);
        }
        for(int i=sb.length()-1;i>=0;i--)
        {   if(sb.charAt(i)%2 !=0)
            {  return sb.toString();
            }
            else
            {   sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}
