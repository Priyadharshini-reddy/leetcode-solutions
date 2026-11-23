class Solution {
    public int openLock(String[] deadends, String target) {
        String s ="0000";
        Queue<String> q=new LinkedList<>();
        q.offer(s);
        int count=0;
        Set<String> visited = new HashSet<>();
        visited.add(s);
Set<String> dead = new HashSet<>(Arrays.asList(deadends));
if(dead.contains(s)) return -1;
        while(!q.isEmpty()){
            int size=q.size();

            
            for(int j=0;j<size;j++){
                String current =q.poll();
                if(current.equals(target)){
                    return count;
                }
                for(int i=0;i<4;i++){
                    char[] arr = current.toCharArray();
                    arr[i] = (char)((current.charAt(i) - '0' + 1) % 10 + '0');
                    String next = new String(arr);

                    arr[i] = (char)((current.charAt(i) - '0' + 9) % 10 + '0');
                    String prev = new String(arr);
                    if(!dead.contains(prev) && !visited.contains(prev)){
                        visited.add(prev);
                        q.offer(prev);
                    }
                    if(!dead.contains(next) && !visited.contains(next)){
                        q.offer(next);
                        visited.add(next);
                    }


                }
            }
            count++;
        }
        return q.isEmpty()?-1:count;
    }
}
/**




 */