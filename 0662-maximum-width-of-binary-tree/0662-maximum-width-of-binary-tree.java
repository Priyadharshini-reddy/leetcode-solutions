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
    int width=0;
    List<Long> list=new ArrayList<>();
    public int widthOfBinaryTree(TreeNode root) { 
        /**
        assign them indices 
        u need assign first 
        now depth would be another local variable 
        at that depth 
        where it is first time take that value 
        how do we know its first time 
        a list 
        whose values are first occurances 
        add to it 
        and and then u current at that depth too so 

        formula = currindex-firstindex+1;
        
         */
         dfs(root,0,0);
         return ans;
    }

   void dfs(TreeNode node,int depth,long index){
         if(node==null) {
            return;
         } 
            if(depth==list.size()){
                list.add(index);
            }
            width= (int)(index-list.get(depth)+1);
            ans=Math.max(ans,width);

         dfs(node.left,depth+1,2*index);
          dfs(node.right,depth+1,2*index+1);

   }

}