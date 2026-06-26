import java.util.*;
class Solution {    
    public String longestCommonPrefix(String[] str) {
        //your code goes here
        Arrays.sort(str);
        String ans;
        int n=str.length;
        String s1=str[0];
        String s2=str[n-1];
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<s1.length();i++)
        {   if(s1.charAt(i)==s2.charAt(i))
            {   sb.append(s1.charAt(i));
            }
            else
            {   return sb.toString();
            }
        }
        return sb.toString();
    }
}