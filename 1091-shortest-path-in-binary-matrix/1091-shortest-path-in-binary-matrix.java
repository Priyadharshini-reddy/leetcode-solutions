class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
     int count=1;
        int m=grid.length;
        int n=grid[0].length;
        boolean [][] visited=new boolean [m][n];
        Queue<int []> q=new LinkedList<>();
        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) {
            return -1;
        }

        q.offer(new int [] {0,0});
        int[][] directions = {
    {-1, -1}, {-1, 0}, {-1, 1},
    {0, -1},           {0, 1},
    {1, -1},  {1, 0},  {1, 1}
};
 visited[0][0] = true;

        while(!q.isEmpty()){
            
            int size=q.size();
            for(int i=0;i<size;i++){
                int [] curr=q.poll();
                
                int row=curr[0];
                int col=curr[1];
                if (row == m - 1 && col == n - 1) {
                    return count;
                }

                
                for(int []dir:directions){
                    int r=row+dir[0];
                    int c=col+dir[1];
                    if(r>=0 && c>=0 && c<n && r<m && !visited[r][c] && grid[r][c]==0){
                        visited[r][c]=true;
                        q.offer(new int[]{r,c});
                    }
                }
            }
            count++;
        }
        return -1;
    }
}
/**



 */