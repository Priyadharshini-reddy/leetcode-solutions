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
      HashMap<Integer,Integer> map=new HashMap<>();
        int preindex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      
        for(int i=0;i < inorder.length;i++){
        map.put(inorder[i],i);
        }
     return build(preorder,0,inorder.length-1);
    }
    // ok now u have to build the tree and return so take,if it returns the node i mean wait it builds left and right and then returns null or returns left or right and that is being attached to left and right 
    TreeNode build(int [] preorder,int left,int right){
        if(left>right){
            return null;
        }
        /*what deos left become 
        it was pre order became 1 
        
         */
         int rootval=preorder[preindex++];
         TreeNode root= new TreeNode(rootval);
        int mid=map.get(rootval);
      root.left=build(preorder,left,mid-1);
       root.right=build(preorder,mid+1,right);
       return root;
    }
    
}