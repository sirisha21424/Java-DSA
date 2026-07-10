import java.util.*;
class Solution {
    public ListNode insertAtHead(ListNode head, int X) {
        //YOUR CODE GOES HERE
        ListNode first=new ListNode(X);
        first.next=head;
        return first;
    }
}