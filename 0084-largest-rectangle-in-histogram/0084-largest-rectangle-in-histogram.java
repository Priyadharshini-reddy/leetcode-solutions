class Solution {
    public int largestRectangleArea(int[] heights) {
     int prevmin[]=new int[heights.length];
     int nextmin[]=new int[heights.length];
     Arrays.fill(prevmin,-1);
     Arrays.fill(nextmin,-1);
    Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

    for(int i=0;i<heights.length;i++){
       
       while(!s.isEmpty() && heights[s.peek()]>heights[i]){
           nextmin[s.pop()]=i;
       }
       s.push(i);
    }
       
       while (!s.isEmpty()) {
            nextmin[s.pop()] = heights.length;
        }
    
    
    for(int i=heights.length-1;i>=0;i--){
       
       while(!s2.isEmpty() && heights[s2.peek()]>heights[i]){
           prevmin[s2.pop()]=i;
       }
       s2.push(i);
    }
 int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            int width = nextmin[i] - prevmin[i] - 1;
            int area = width * heights[i];

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;


        
    }
}
/**
monotonic stack :
and write the code idea for next min
 

2 1 5 6 2 3
6 

for 5 i.e 2
min = 1
max=4



 */