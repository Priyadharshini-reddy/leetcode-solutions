class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> list=new ArrayList<>();
       int start = newInterval[0];
        int end = newInterval[1];
          for(int i=0;i<intervals.length;i++){
            if(intervals[i][1]<start){
                list.add(intervals[i]);
                // before  strt and end r of those which we are compaing with so modify modify 
            }
                else if(intervals[i][0]>end){
                    // after 
                    list.add(new int[]{start, end});

                start = intervals[i][0];
                 end = intervals[i][1];
                }
                else{
                    /**
                    it means intervals end is not less than strt of new 
                        and also intervals strt is not greater than end 
                        that means 
                     */
                   
                start = Math.min(start, intervals[i][0]);
                end = Math.max(end, intervals[i][1]);
                }
          }
           list.add(new int[]{start, end});
        return list.toArray(new int[list.size()][]);
    }
}