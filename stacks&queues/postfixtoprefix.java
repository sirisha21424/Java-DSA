import java.util.*;
class Solution {
    public String postToPre(String postfix) {
        // Your code goes here
        Stack<String> st=new Stack<>();
        for(int i=0;i<postfix.length();i++)
        {   char ch=postfix.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {   st.push(String.valueOf(ch));
            }
            else
            {   String s1=st.peek();
                st.pop();
                String s2=st.peek();
                st.pop();
                String str=ch+s2+s1;
                st.push(str);
            }
        }
        return st.peek();

    }
}
