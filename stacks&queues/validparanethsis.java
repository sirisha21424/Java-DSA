class Solution {
    public boolean isValid(String str) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {   if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
            {   st.push(str.charAt(i));
            }
            else
            {   if(st.isEmpty()) {
                    return false;
                }
                if(str.charAt(i)==')')
                {   if(st.peek()=='(')
                    {   st.pop();
                    }
                    else
                    {   return false;
                    }
                }
                else if(str.charAt(i)==']')
                {   if(st.peek()=='[')
                    {   st.pop();
                    }
                    else
                    {   return false;
                    }
                }
                else
                {   if(st.peek()=='{')
                    {   st.pop();
                    }
                    else
                    {   return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}