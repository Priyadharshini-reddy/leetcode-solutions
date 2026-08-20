/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x;}
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
    
        if(p.val>root.val && q.val>root.val){
           return lowestCommonAncestor(root.right,p,q);
        }
         else if(p.val<root.val && q.val<root.val){
           return lowestCommonAncestor(root.left,p,q);
        }
       

        
     
            return root;
    /**
    
    if equal then search for the other one 
    wait if equal and lies in same subtree then return it 

     */
    }
}