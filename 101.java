/**
 * Definition for a binary tree a.
 * public class Treea {
 *     int val;
 *     Treea left;
 *     Treea right;
 *     Treea() {}
 *     Treea(int val) { this.val = val; }
 *     Treea(int val, Treea left, Treea right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        // if(a.right==null && a.left==null) return true;
          
        return helper(root.right,root.left);
    }
    private boolean helper( TreeNode a,TreeNode b){
         if(a==null && b==null) return true;
           if(a!=null && b==null) return false;
            if(a==null && b!=null) return false;
            if(a.val!=b.val) return false;

          return helper(a.right,b.left) && helper(a.left,b.right);
          
    }
}