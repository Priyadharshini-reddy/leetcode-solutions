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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode node1=head;
       ListNode node2=head;
       ListNode fast=head;
       for(int i=1;i<k;i++){
           node1=node1.next;
           fast=fast.next;
       }
      while(fast.next!=null){
        fast=fast.next;
        node2=node2.next;
      }
     int temp=node1.val;
     node1.val=node2.val;
     node2.val=temp;
     return head;


        
    }
}
