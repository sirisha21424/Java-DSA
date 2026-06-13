import java.util.*;
class Solution {
    public int[] nextSmallerElements(int[] arr) {
        // Your code goes here
        int n=arr.length;
        int[] temp=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {   while((!st.isEmpty()) && st.peek()>=arr[i])
            {   st.pop();
            }
            if(st.isEmpty())
            {   temp[i]=-1;
            }
            else
            {   temp[i]=st.peek();

            }
            st.push(arr[i]);
        }
        return temp;
    
    }
}