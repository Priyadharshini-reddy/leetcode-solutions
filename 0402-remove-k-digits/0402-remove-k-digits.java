class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s= new Stack<>();
        
        for(int i=0;i<num.length();i++){
 char curr = num.charAt(i);
            while( !s.isEmpty() && curr<s.peek() && k>0){
                s.pop();
                k--;
            }
            
              s.push(curr);
           
        }
        while(k>0){
            s.pop();
            k--;
        }
        if(s.isEmpty()){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(char c:s){
            sb.append(c);
        }
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        if(sb.length()==0){
            return "0";
        }
return sb.toString();
    }
}
// 4321
// append 