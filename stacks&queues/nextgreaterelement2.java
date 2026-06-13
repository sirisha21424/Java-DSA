import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] arr) {
         int n=arr.length;
        int[] temp=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--)
        {   int j=i%n;
            while((!st.isEmpty()) && st.peek()<=arr[j])
            {   st.pop();
            }
            if(i<n)
            {
                if(st.isEmpty())
                {   temp[j]=-1;
                }
                else
                {   temp[j]=st.peek();

                }
            }
            st.push(arr[j]);
        }
        
        return temp;
   
    }
}
