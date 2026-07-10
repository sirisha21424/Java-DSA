package Linkedlist;

class Solution {
    public int getLength(ListNode head) {
        // Your code goes here
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {   count++;
            temp=temp.next;
        }
        return count;
    }
}
