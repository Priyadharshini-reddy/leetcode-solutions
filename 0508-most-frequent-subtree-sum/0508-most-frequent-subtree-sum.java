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
    public int[] findFrequentTreeSum(TreeNode root) {
         dfs(root) ; 
     int maxfreq=0;
     for(int freq:map.values()){
        maxfreq=Math.max(freq,maxfreq);
     }

   List<Integer> list =new ArrayList<>();
   for(int sum:map.keySet()){
    if(map.get(sum)==maxfreq){
        list.add(sum);
    }
   }

   int ans[]=new int[list.size()];
   for(int i=0;i<list.size();i++){
    ans[i]=list.get(i);
   }
      return ans;
        
    }

    public int dfs(TreeNode node){
        if(node==null){
            return 0;
        }
       int left= dfs(node.left);
       int right= dfs(node.right);
        
        int sum=node.val+left+right;
     
    map.put(sum,map.getOrDefault(sum,0)+1);
    return sum; 
    }
 
}