/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> list=new ArrayList<>();

        if(root==null){
            return list;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
              level.add(curr.val);
            if(curr.left!=null){
                q.offer(curr.left);
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
        }
        list.addFirst(level);
    }
    return list;
}
}
/** 
 q not empty 
 u r accessing indices of q 
  to build a queue and to empty a q 
  so at each leevl u r building a q 
  and next one u r emptying it 
  while emptying building an other simultaneusly

 */