import java.util.*;

class Solution {
    public String infixToPostfix(String s) {
        // Your code goes here
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {   char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {   sb.append(ch);
            }
            else if(ch=='(')
            {   st.push(ch);
            }
            else if(ch==')')
            {   while(st.size()!=0 && st.peek()!='(')
                {   sb.append(st.pop());
                }
                st.pop();
            }
            else
            {   while (!st.isEmpty() &&
                       precedence(ch) <= precedence(st.peek())) {
                    sb.append(st.pop());
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
  
    }
    public int precedence(char c)
    {   if(c=='^')
        {   return 3;
        }
        else if(c=='*' || c=='/')
        {   return 2;
        }
        else if(c=='+'|| c=='-')
        {   return 1;
        }
        else{   return -1;
        }
    }
}