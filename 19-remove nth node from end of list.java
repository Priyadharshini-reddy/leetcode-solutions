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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null){
            return null;
        }


        ListNode curr=head;
        int m=0;
        while(curr!=null){
            m++;
            curr=curr.next;

        }
        int req=m-n;
        int traverse=1;
        ListNode temp=head;
        if(req==0){
            return head.next;
        }
        while(traverse<req){
            temp=temp.next;
            traverse++;

        }
       
        temp.next=temp.next.next;




    return head;
        
    }
}