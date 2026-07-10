package Linkedlist;
package Linkedlist;

public class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode insertBeforeHead(ListNode head, int data) {
        // Your code goes here
        ListNode first=new ListNode(data);
        if (head == null)
            return first;
        head.prev=first;
        first.next=head;
        first.prev=null;
        return first;
    }
}
