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
   
   int ans=0;
    public int longestUnivaluePath(TreeNode root) {
          dfs(root);
          return ans;
      
  
    }
    public int dfs(TreeNode node){
         if(node==null){
            return 0;
         }
         int left=dfs(node.left);
         int right=dfs(node.right);
         int leftpath=0;
         int rightpath=0;
         if( node.left!=null && node.left.val==node.val){
            // checking if left can extend 
            leftpath=left+1;
         }
         if( node.right!=null && node.right.val==node.val){
            // checking if left can extend 
            rightpath=right+1;
         }
         ans=Math.max(ans,leftpath+rightpath);
         return Math.max(leftpath,rightpath);
             

    }
}
/**



 */