import java.util.*;
class Solution {
    PriorityQueue<Integer> pq;

    public void initializeHeap() {
        pq=new PriorityQueue<>();
        
    }

    public void insert(int key) {
        pq.offer(key);
    }

    public void changeKey(int index, int newVal) {
        List<Integer> list=new ArrayList<>(pq);
        if(index<0 || index>pq.size())
            return ;
        list.set(index,newVal);
        pq.clear();
        pq.addAll(list);

        
    }

    public void extractMin() {
        if(pq.size()!=0)
            pq.poll();
        
    }

    public boolean isEmpty() {
        return pq.isEmpty();
        
    }

    public int getMin() {
        return pq.peek();
       
    }

    public int heapSize() {
        return pq.size();
        
    }
}