import java.util.*;
class Solution {
    public String prefixToInfix(String s) {
        // Your code goes here
        Stack<String> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--)
        {   char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {   st.push(String.valueOf(ch));
            }
            else
            {   String top1=st.peek();
                st.pop();
                String top2=st.peek();
                st.pop();
                String str="("+top1+ch+top2+")";
                st.push(str);
            }
        }
        return st.peek();
    }
}
