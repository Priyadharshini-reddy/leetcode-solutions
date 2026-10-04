class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
 boolean [][] dp= new boolean[n][n];
 int start=0;
 int maxlen=1;
    for(int len=1;len<=n;len++){
        for(int i=0;i<=n-len;i++){
            int j=i+len-1;

            if(len==1){
                dp[i][j]=true;
            }
            else if(len==2){
              dp[i][j]=(s.charAt(i) == s.charAt(j));
                     
            }else{

                dp[i][j]=(s.charAt(i) == s.charAt(j)) &&dp[i+1][j-1];
            }
            if(dp[i][j] && len>maxlen){
                start=i;
                maxlen=len;
            }

        }
    }
    return s.substring(start,start+maxlen);
    }
}
/**
the problem was to identify if this is a palindrome 
for that check for one for 2 
and then for 3 
thats simple to say but actual trick is smtg different 
babad 5-3 2 
 0 i j
1 

 */
/** 
palindromic substring 
i  mean left and right is what we have
if ok so chill coz dp is a hard nut to crack
babcacd 
      0 1 2 3 4
      b a b a d

0 b   ?
1 a     ?
2 b       ?
3 a         ?
4 d            ?
         
i=0;
i=3
j=1
0 1 -ba 
1 2 -ab
2 3 -ba 
3 4-ad

thats quite pretty and beautliful 
here we are just making it like that 
so first iterate for lengths 
and for this length i 

length=3 
i=0
i=1
i=2

babad

197  aba 1 to 3
8 left 

5 u cant leave 2 more too i mean leave 1 more 
8  so done with 2
 7 do another 
 so becomes 6

 now we will first sinish leetcode 5 code 
 and then linkedlist a bit 
 and then try to code lis 
 3 will be done and then 
 we have 5 more 
 we ll see those 5 
 before we have in linkedlists to revise or build 143 on our own to make it done 25 and browser history 
 about what we left we will do fs 
 u will just have ur 1 hour ruined and some 1 hr again u may sleep 

 
 */