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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        if(root==null){
             return list; 

    }
    helper(root,"",list);
    return list;
    }
    public void helper(TreeNode node,String path,List<String> list){

        if(node==null) return;
       if(path.isEmpty()){
        path="" +node.val;

       }else{
        path=path+"->"+node.val;
       }
        
        if(node.right==null && node.left==null){
        
            list.add(path);
        }
        helper(node.right,path,list);
        helper(node.left,path,list);

    }
}