
/**
this or next 

 */
 class Solution {
    public int change(int amount, int[] coins) {

        int n = coins.length;

        int[][] dp = new int[n + 1][amount + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= amount; j++) {

                dp[i][j] = dp[i - 1][j];

                if (j >= coins[i - 1]) {
                    dp[i][j] += dp[i][j - coins[i - 1]];
                }
            }
        }

        return dp[n][amount];
    }
}
/**
u added 1 
and using 2 u added to 4 

to kae 3 
u dont take 
thats 1 
u take it and then 
rest amount thats one way  
for 4 
we added right 
what 
1 
an dtake 2 
for 2 we added it 
and 2 reamained so add it 
one other way and for 2 
it was 2 
so done yeah 


 */