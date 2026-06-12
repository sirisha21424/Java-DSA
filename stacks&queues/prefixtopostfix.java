import java.util.*;
class Solution {
    public String prefixToPostfix(String s) {
        // Your code goes here
        Stack<String> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {   char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {   st.push(String.valueOf(ch));
            }
            else
            {   String s1=st.peek();
                st.pop();
                String s2=st.peek();
                st.pop();
                String str=s1+s2+ch;
                st.push(str);
            }
        }
        return st.peek();
    }
}
