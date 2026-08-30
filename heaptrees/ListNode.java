import java.util.*;
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++)
        {   ListNode curr=lists[i];
            while(curr!=null)
            {
                pq.offer(curr.val);
                curr=curr.next;
            }
        }
        if (pq.isEmpty()) {
            return null;
        }
        ListNode root=new ListNode(pq.poll());
        ListNode curr1=root;
        while(pq.size()>0)
        {   curr1.next=new ListNode(pq.poll());
            curr1=curr1.next;
        }
        return root;


        
    }
}

