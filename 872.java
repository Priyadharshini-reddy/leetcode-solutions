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
    
        List<Integer> leaves1=new ArrayList<>();
         List<Integer> leaves2=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        preorder1(root1);
        preorder2(root2);

        return leaves1.equals(leaves2);
    }
    private void preorder1(TreeNode Root1){
        if(Root1==null) return;
        if(Root1.right==null && Root1.left==null){
            leaves1.add(Root1.val);
            return;
        }
         
        
        preorder1(Root1.left);
         preorder1(Root1.right);



    }
     private void preorder2(TreeNode Root2){
        if(Root2==null) return;
        if(Root2.right==null && Root2.left==null){
            leaves2.add(Root2.val);
            return;
        }
         
        
        preorder2(Root2.left);
         preorder2(Root2.right);



    }
     



    }
