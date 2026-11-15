
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int buy = -prices[0];
        int sell = 0;
        int cooldown = 0;
     

        for (int i = 1; i < n; i++) {

            int prevBuy = buy;
            int prevSell = sell;
            int prevCooldown = cooldown;

            // Hold or buy
            buy = Math.max(prevBuy, prevCooldown - prices[i]);

            // Sell today's stock
            sell = prevBuy + prices[i];

            // Rest or enter cooldown
            cooldown = Math.max(prevCooldown, prevSell);
        }

        return Math.max(sell, cooldown);
    }
}

