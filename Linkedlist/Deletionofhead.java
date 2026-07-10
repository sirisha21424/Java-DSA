package Linkedlist;

public class Deletionofhead {class Solution {
    public ListNode deleteHead(ListNode head) {
        //your code goes here
        if (head == null)
            return null;
        return head.next;
    }
}
    
}
