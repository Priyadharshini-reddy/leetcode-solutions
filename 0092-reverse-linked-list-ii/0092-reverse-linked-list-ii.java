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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode start = prev.next; 
        ListNode curr = start;

        ListNode prevNode = null;

       
        for (int i = 0; i <= right - left; i++) {
            ListNode next = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = next;
        }

      
        prev.next = prevNode;
        start.next = curr;

        return dummy.next;
    }
}
/* dummy and dummy to next would be something i mean the formal one 
when u just reverse the part and try attacj=hing what happens u found left as 1 so u have to reverse from there 
ok so u need a prev i.e one before left that should be connected to the last node and ur start is */