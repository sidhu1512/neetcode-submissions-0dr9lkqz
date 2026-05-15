class Solution {
    public int maxProfit(int[] prices) {
        int profit =0, buy = prices[0];

        for(int n : prices){
            profit = Math.max(profit, n - buy);
            buy = Math.min(buy, n);
        }

        return profit;
    }
}
