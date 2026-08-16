class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0], maxProfit =0;
        for(int n: prices){
            if(buy < n) maxProfit = Math.max(maxProfit, n - buy);
            else buy =n;
        }
        return maxProfit;
    }
}
