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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
       if(root==null){
        return null;
       }
       if(depth(root.right)==depth(root.left)){
        return root;
       }
       if(depth(root.left)>depth(root.right)){
        return subtreeWithAllDeepest(root.left);
       }
       return subtreeWithAllDeepest(root.right);
    }

    public int depth(TreeNode node){
        if(node==null){
            return 0;
        }
        return Math.max(depth(node.left),depth(node.right))+1;
    }
}

// at evry point u have to check that depth of left is greater than go into left 
// else go to right 