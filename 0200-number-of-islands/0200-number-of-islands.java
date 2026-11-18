class Solution {
    public int numIslands(char[][] grid) {
        int island=0;
        int m=grid.length;
        int n=grid[0].length;
        boolean visited[][] =new boolean[m][n];
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(!visited[i][j] && grid[i][j]=='1'){
                island++;
                dfs(i,j,grid,visited);
            }
        }
      }
        return island;
    }
    void dfs(int i,int j,char [][] grid,boolean visited[][]){
       int m=grid.length;
        int n=grid[0].length;
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]=='0' || visited[i][j]==true){
            return;
        }
        visited[i][j]=true;
        dfs(i-1,j,grid,visited);
        dfs(i+1,j,grid,visited);
        dfs(i,j-1,grid,visited);
        dfs(i,j+1,grid,visited);

    }
}

/**
once visited put it visited and after visiting 

visited[that]=true 
and neighbours true 




 */