class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
        }

        int[] visited = new int[numCourses];
        for(int i=0;i<numCourses;i++){
           if(visited[i]==0){
            if(!dfs(visited,i,adj)){
                return false;
            }
           }
        }
        return true;


    }

    boolean dfs(int [] visited,int node,List<List<Integer>> adj){
     if(visited[node]==1){
        return false;
     }
     if(visited[node]==2){
        return true;
     }
        visited[node]=1;
        for(int next: adj.get(node)){
            if(!dfs(visited,next,adj)){
                return false;
            }
        }
        visited[node]=2;
        return true;
    }
}
/**

0 - > 1 
0-2

0 → [1]
1 → [2, 3]
2 → []
3 → [4]
4 → [2]

0 1 2 3 4 


 */