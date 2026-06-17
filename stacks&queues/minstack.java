import java.util.*;
class MinStack {
    Stack<Integer> st;
    Stack<Integer>s1;

    public MinStack() {
        st=new Stack<>();
        s1=new Stack<>();
        
    }

    public void push(int val) {
        st.push(val);
        if(s1.isEmpty() || val<=s1.peek())
        {   s1.push(val);
        }

   
    }

    public void pop() {
        if(st.peek() == s1.peek())
        {   s1.pop();
        }
        st.pop();


    }

    public int top() {
        return st.peek();
    
    }

    public int getMin() {
        return s1.peek();
        
    }
}