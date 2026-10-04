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
    public ListNode removeZeroSumSublists(ListNode head) {
         ListNode dummy = new ListNode(0);
        dummy.next = head;
           HashMap<Integer, ListNode> map = new HashMap<>();

        int prefix = 0;
        ListNode curr = dummy; 
         while (curr != null) {
            prefix += curr.val;
            map.put(prefix, curr);
            curr = curr.next;
        }
         prefix = 0;
        curr = dummy;
        // Pass 2
        while (curr != null) {
            prefix += curr.val;

            curr.next = map.get(prefix).next;

            curr = curr.next;
        }

        return dummy.next;
         
    }
}
/**
so listen if we wnated prefix sum of 1 to 3 we went 

3-0
that means 3-1 included 1 within and subtracted it too

and now index 3 has sum 7
and index    6 has sum 7 
now 





 */
/**
yeah right maybe just revinding the previous ones 
algorithms and all


prefix sum is like 
so yeah i mean for that what do we do except of 

hashmap   ->  sum of previous,Node
            whenever curr

1 2 -3 3 1

0
1
3
0
3
5

0 
1 -1
3 -2
6 -3
3 =-3
7 -4

0 -0
3 -3
3-0
3-0








 */
/**


 */