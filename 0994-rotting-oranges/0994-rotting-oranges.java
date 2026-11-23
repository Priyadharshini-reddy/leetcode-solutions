class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<int []> q= new LinkedList<>();
        int minutes=0;
        int fresh=0;
       
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[][] directions = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };
        while(!q.isEmpty() && fresh>0){
            
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr []=q.poll();
                for(int [] dir:directions){
                    int r= dir[0]+curr[0];
                    int c= dir[1]+curr[1];
                    if(r>=0 && c>=0 && c<n && r<m && grid[r][c]==1){
                        grid[r][c]=2;
                        fresh--;
                        q.offer(new int []{r,c});
                    }



                }
                
            }
            
     minutes++;

        }


        return fresh == 0 ? minutes : -1;
    }
}

/**

to find if all are rotten u can do what 






 */