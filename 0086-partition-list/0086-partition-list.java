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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1= new ListNode(0);
         ListNode dummy2= new ListNode(0);
         ListNode min=dummy1;
         ListNode max=dummy2;
        ListNode curr=head;
        while(curr!=null){
              ListNode next=curr.next;
         if(curr.val<x){
          
          min.next=curr;
          min=min.next;
          min.next=null;
         }
         else if(curr.val>=x){
            max.next=curr;
            max=max.next;
            max.next=null;
         }
            curr=next;
        }
      min.next=dummy2.next;
      return dummy1.next;  
    }
}