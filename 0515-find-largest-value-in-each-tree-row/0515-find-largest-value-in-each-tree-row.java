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
    List<Integer> list=new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
       if(root==null){
        return list;
       }
        helper(root,0);
        return list;
    }

    public void helper(TreeNode node,int depth){
       if(node==null){
        return;
       }

      
       if(depth==list.size()){
        list.add(node.val);
       }
      else if(list.get(depth)<node.val){
        list.set(depth,node.val);
      }
    
       helper(node.left,depth+1);
        helper(node.right,depth+1);
    }
} 
/**
uhhh chill for  a while 'take a chill pill mannn '
u have to compare when thats equal 

 */