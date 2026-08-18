class Solution {
    public int findMinArrowShots(int[][] points) {
      Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows=0;
        int end=points[0][1];
        for(int i=0;i<points.length;i++){
          if(points[i][0]>end){
                arrows++;
                end=points[i][1];
            }
            
        }
        /**
        take an arrow for less 
        u need to add an arrrow when start >end 
         */
         return arrows+1;
    }
}