/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
    return head;
    
        ListNode curr=head;
        ListNode currr=head;
        int size=0;
        while(curr.next!=null){
            curr=curr.next;
            size++;
        }
        size++;
         k=k%size;
        curr.next=head;
   int count=1;
   int tailcount=size-k;

        while(count!=tailcount){
            count++;
            currr=currr.next;

        }
       head= currr.next;
       currr.next=null;
        
return head;
    }
}
/**
ok so make it circular and then we have a head there when curr to next is head 
from there go k steps and next one should be new head and cut off connection to head 

length - k is the new head


 */