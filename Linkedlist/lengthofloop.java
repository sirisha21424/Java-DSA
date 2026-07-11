package Linkedlist;

 class Solution {
     public int findLengthOfLoop(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {   slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {   break;
            }
        }
        if(fast!=slow)
        {   return 0;
        }
        slow=head;
        while(slow!=fast)
        {   slow=slow.next;
            fast=fast.next;
        }
        int count=1;
        fast=slow.next;
        while(fast!=slow)
        {   fast=fast.next;
            count++;
        }
        return count;



     }
 }
