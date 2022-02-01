/*
Algorithm:
1. Keep track of min price,
2. Find the minimum price and subract that min price with other prices
3. The greatest difference will be the profit

*/

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;  
    }
}
