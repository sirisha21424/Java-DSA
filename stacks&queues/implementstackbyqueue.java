import java.util.*;
class QueueStack {
   Queue<Integer> q;
    public QueueStack() {
        q=new LinkedList<>();
    }

    public void push(int x) {
       q.offer(x);
       int size=q.size();
       for(int i=0;i<size-1;i++)
       {    q.offer(q.poll());
       }
       
    }

    public int pop() {
        return q.poll();
      
    }

    public int top() {
        return q.peek();
        
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }
}