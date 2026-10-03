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
    public int[] nextLargerNodes(ListNode head) {
         ArrayList<Integer> arr = new ArrayList<>();
          while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int n=arr.size();
 int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
          while(!st.isEmpty() && arr.get(st.peek())<arr.get(i)){
            ans[st.pop()]=arr.get(i);
          }
            st.push(i); 
        }
        return ans;
    }
}
/**
for next greater element 
store this 
and if next is greater then pop this

thoda sa free and then too we revise the patterns fs
 */
/**
code 1019 
see one dp 
code one of them 
and then go for ml if u want a bit 
else u can also go for more algorithms thats ok 
and what are the patterns even majorly left out 
i mean u have an entire map of things in ur mind already 
and tommorrow we will revise things once 
and fit every pattern and solving process in our brain 
and from next u know what to do 
so finally the thing that u need is focus and a bit of thought process before that too its much needed than we think 
so retard a bit is always much finer thing to do 
and for now its 10 30 
we can stay till 1 30 
so its 3 hours 
lets go
for 2 ig 40 min is enough rest will be looked at dont worry


 */