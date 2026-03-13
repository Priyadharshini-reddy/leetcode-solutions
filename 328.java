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
    public ListNode oddEvenList(ListNode head) {
        if(head==null|| head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode firsteven=head.next;
        ListNode even=head.next; 
        while(even!=null && even.next!=null){

         ListNode oddnext=odd.next.next;
         odd.next=oddnext;
         odd=oddnext;
         ListNode evennext=even.next.next;
         even.next=evennext;
         even=evennext;


        }

        odd.next=firsteven;
        return head;
        
    }
}