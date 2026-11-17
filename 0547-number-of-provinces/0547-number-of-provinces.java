class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean visited []=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(visited,i,isConnected);
            }
        }
return count;
    }
 void dfs(boolean visited[],int node,int [][] isConnected){
         visited[node]=true;
         for(int j=0;j<isConnected.length;j++){
            if(isConnected[node][j]==1 && !visited[j]){
                dfs(visited,j,isConnected);
            }
         }
    }

}
/**
owho said u need to sleep u may after this and first unit problly 

dfs 
first visit all of its nieghbours 
and if done loop ends 
that means its a province till there 
since there is no way u can go somewhere else 
and then get other vertices 
if not visited start again and expand the province 


u know what u undertood so code it 

 **/