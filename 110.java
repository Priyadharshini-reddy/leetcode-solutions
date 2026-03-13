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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        

        int rightheight=height(root.right);
        int leftheight=height(root.left);
        if(Math.abs(rightheight-leftheight)>1){
            return false;

        }
       return isBalanced(root.right) && isBalanced(root.left);
        
    }
    private int height(TreeNode node){
        if(node==null) return 0;
        int right=height(node.right);
        int left=height(node.left);
        return Math.max(right,left)+1;


    
}
}