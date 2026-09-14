class Solution {
    public String smallestSubsequence(String s) {
         HashMap<Character,Integer> map=new HashMap<>();
        Stack<Character> s1=new Stack<>();
         HashSet<Character> inStack = new HashSet<>();
        
   for(char c : s.toCharArray()){
    map.put(c, map.getOrDefault(c, 0) + 1);
}

for(char c :s.toCharArray()){

  map.put(c,map.get(c)-1);
  if(inStack.contains(c)){
    continue;
  }

  while(!s1.isEmpty() && s1.peek()>c && map.get(s1.peek())>0){
     inStack.remove(s1.peek());
    s1.pop();
  }
   s1.push(c);
    inStack.add(c);



}
 StringBuilder ans = new StringBuilder();

        for (char c : s1) {
            ans.append(c);
        }

        return ans.toString();

    }
}