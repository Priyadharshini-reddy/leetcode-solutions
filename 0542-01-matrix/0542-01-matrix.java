class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m= mat.length;
        int n=mat[0].length;
        int distances [][]=new int[m][n];
        Queue<int []> q=new LinkedList<>();
         for(int i = 0; i < m; i++) {
            Arrays.fill(distances[i], -1);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    distances[i][j] = 0;
                }
            }
        }
        int [][] directions={ {0,1},{1,0},{-1,0},{0,-1} };

        while(!q.isEmpty()){
         int size=q.size();
           for(int i=0;i<size;i++){
            int curr[]=q.poll();
           
            for(int [] dir:directions){
                
            int r=curr[0]+dir[0];
            int c=curr[1]+ dir[1];
            if(r >= 0 && c >= 0 && r < m && c < n
                    && distances[r][c] == -1) {

                distances[r][c]=distances[curr[0]][curr[1]]+1;
               q.offer(new int[]{r,c});
            }
            
        }

            
        }

        
    }
    return distances;
}
}
/**
so at the start push all zeroes 



 */