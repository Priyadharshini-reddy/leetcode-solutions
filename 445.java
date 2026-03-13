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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       

        ListNode prev1=null;
        ListNode curr1=l1;
        ListNode prev2=null;
        ListNode curr2=l2;
        while(curr1!=null){
            ListNode next=curr1.next;
            
            curr1.next=prev1;
            prev1=curr1;
            curr1=next;
        }
         while(curr2!=null){
            ListNode next=curr2.next;
            
            curr2.next=prev2;
            prev2=curr2;
            curr2=next;
        }
       
       
         int carry=0;
ListNode dummy=new ListNode(0);
ListNode dig=null;

        while(carry!=0||prev1!=null||prev2!=null){
            int sum=carry;
            if(prev1!=null){
                sum+=prev1.val;
                prev1=prev1.next;
            }
              if(prev2!=null){
                sum+=prev2.val;
                prev2=prev2.next;
            }

             ListNode head=new ListNode(sum%10);
            // digit.val=sum%10;
            carry=sum/10;
            head.next=dig;
            dig=head;

        }
        

return dig;
        
        
    }
}