import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st =new Stack<>();
        int totalsum=0;
        for(int i=0;i<operations.length;i++)
        {   if(operations[i].equals("D"))
            {   int top=st.peek();
                st.push(2*top);
               
            }
            else if(operations[i].equals("+"))
            {  if(st.size()>=2)
               {    int sum=st.peek()+st.get(st.size()-2);
                    st.push(sum);
               }
            }
            else if(operations[i].equals("C"))
            {   if(st.size()>=1)
                {   st.pop();
                }
            }
            else
            {   int x=Integer.parseInt(operations[i]);
                st.push(x);
            }
        }
        while(st.size()>=1)
        {   totalsum+=st.peek();
            st.pop();
        }
        return totalsum;

        
    }
}