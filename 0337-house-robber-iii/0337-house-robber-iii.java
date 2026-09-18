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
    public int rob(TreeNode root) {
 int ans[]=dfs(root);
       return Math.max(ans[0],ans[1]);
    }
   int[] dfs(TreeNode node){
        if(node==null){
            return new int[]{0,0};
        }
int left[]=dfs(node.left);
int right[]=dfs(node.right);

  int take= node.val+left[1]+right[1];
  int skip=Math.max(left[0],left[1]) +Math.max(right[0],right[1]);
  return new int[]{take,skip};


    }
}
/**
so the changes were 
leftskip and rightskip had no significance 
coz we 




 */





















/**

stacks 
ll tommorrow or today lets see 
dp revision and knowledge of all the patterns over there 
and thats enough for this weekend 

and next main point is 
problems
185 atleast is needed ig 
by next weekend we will reach 200 
and next would be 
backtracking 
graphs 
bs variants 
we will hold the pace and do the essential development activities 



 */