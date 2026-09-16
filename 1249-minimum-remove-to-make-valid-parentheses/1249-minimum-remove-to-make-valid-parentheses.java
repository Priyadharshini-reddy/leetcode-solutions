class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> s1=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           if(c=='('){
            s1.push(i);
           }
           else if(c==')' && !s1.isEmpty() && s.charAt(s1.peek())=='('){
             s1.pop();
           }
           else if(c==')'){
            s1.push(i);
           }

        }
HashSet<Integer> remove = new HashSet<>();

        while (!s1.isEmpty()) {
            remove.add(s1.pop());
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (!remove.contains(i)) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();

    }
}


/**
now its more about 

ok while 
when u find (
push 
index
((
if u had taken an rray how would u so fast know that its having the value
who would loop again


 */






































/**
ok thats abt u thinking a lot in pressure that doesnt even make sense man
thats not needed if u think smtg 
movw with confidence
if u get ( then let it be or store the index maybe 

u get an open 
u get a close and open is top 
pop
only close 
let it stay to be counted 
only open ->the same 
yeah yeah thats fine till where that was ok 
and now not neglecting we will do this one and then go by how it says and a bit on trees 
a single one ig 
then the lists ok 


 */