class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
    
    Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
    int prevstart=intervals[0][0];
    int prevend=intervals[0][1];
    int removed=0;
    for(int i=1;i<intervals.length;i++){

        if(intervals[i][0]< prevend){
            removed++; 
        }
        else{
            prevend=intervals[i][1];
        }
    }

return removed;
    }
}









 /**
     only touch at a point means
     ok wait if they overlap
     we need to remove minimum intervals that overlap
     so beleive removing
     if u have 2 intervals 
     and they overlap 
     remove the one with least ending value
     and go on 
     
      */