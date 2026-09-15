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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root==null){
            return null;
        }
        root.left=trimBST(root.left,low,high);
        root.right=trimBST(root.right,low,high);

        if(root.val<low){
            return root.right;
        }
        if(root.val>high){
            return root.left;
        }
        return root;
    }

}
/**
u should be able to code this for now 
just like 
its k u were just a little low that made u retard really down but fine u will do good 
and now 
if in range fine go left and right and check if greater and smaller handle them 



 */