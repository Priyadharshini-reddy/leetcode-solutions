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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy= new ListNode(0);  
        ListNode prev=dummy;  
        ListNode curr=head;

        while(curr!=null){

            if( curr.next!=null && curr.val==curr.next.val){
                int value=curr.val;
                while( curr!=null && curr.val==value ){
                    curr=curr.next;
                }
               
            }
            else{
                prev.next=curr;
                prev=prev.next;
                curr=curr.next;
            }
        
       
      
        }
        prev.next=null;
        return dummy.next;
           
    }
}
/*
maintain a dummy
compare this with prev 
if same what we do 
remove curr and compare next with prev and so on 
dummy 
and prev=dummy
curr=head
if curr ==prev 
then prev.next=curr.next 
and curr.next=curr
and go on ig    */