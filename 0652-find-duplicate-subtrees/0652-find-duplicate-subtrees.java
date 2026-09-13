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
    List<TreeNode> ans=new ArrayList<>();
    HashMap<String,Integer> map=new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        
      
       dfs(root);
       return ans;

    }

    public String dfs(TreeNode node){
           if(node==null){
            return "#";
           }
           String left=dfs(node.left);
           String right=dfs(node.right);
           String serial=node.val + "," + left +"," +right;
           
            map.put(serial,map.getOrDefault(serial,0)+1);
           if(map.getOrDefault(serial,0)==2){
            ans.add(node);
           }
   return serial;


    }
}

/*



 */