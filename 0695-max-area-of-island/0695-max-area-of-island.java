class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0;
        int m=grid.length;
        int n=grid[0].length;
        boolean visited [][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visited[i][j]==false){
                     int area = dfs(grid, visited, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    int dfs(int [][] grid,boolean [][] visited,int r,int c){
      
      int m = grid.length;
        int n = grid[0].length;

        if (r < 0 || r >= m || c < 0 || c >= n ||
            grid[r][c] == 0 || visited[r][c]) {
            return 0;
        }

        visited[r][c] = true;

        return 1
            + dfs(grid, visited, r - 1, c)
            + dfs(grid, visited, r + 1, c)
            + dfs(grid, visited, r, c - 1)
            + dfs(grid, visited, r, c + 1);

    }
}
/**
if it was 1 visit 
and visit it if its not visited and explore only then 


 */