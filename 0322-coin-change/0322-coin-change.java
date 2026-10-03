 
class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {

                if (coin <= i) {
                    dp[i] = Math.min(dp[i],
                                     dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] == amount + 1
                ? -1
                : dp[amount];
    }
}
/**
 1 2 5 
  0 1 2 3 4 5 6 7 8 9 10 11 
  0 1 12 12 12 12 12 12 12 


y i-coin 
i is 4 and 4-2
dp[2] 
i is 2 

 */