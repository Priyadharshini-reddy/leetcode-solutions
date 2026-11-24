class Solution {
    public int snakesAndLadders(int[][] board) {
        
        int n=board.length;
        int target=n*n;
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        visited.add(1);
        q.offer(1);
        int count=0;

        while(!q.isEmpty()){
           int size=q.size();
           for(int i=0;i<size;i++){
            int curr=q.poll();
            if(curr==target){
                return count;
            }
            for(int next=curr +1; next<=Math.min(target,curr+6);next++){
                int r = (next - 1) / n;
                int c = (next - 1) % n;
                int row = n - 1 - r;
                int col;
                if(r%2==0){
                    col=c;
                }
                else{
                    col=n-1-c;
                }

                int value=board[row][col];
                if(!visited.contains(next) && value==-1){
                    q.offer(next);
                    visited.add(next);
                }
                else if(!visited.contains(value) && value!=-1){
                    q.offer(value);
                    visited.add(value);
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