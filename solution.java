class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];

        for (int sell : prices) {
            if (sell > buy) {
                int currentProfit = sell - buy;
                if (currentProfit > maxProfit)
                    maxProfit = currentProfit;
            } else {
                buy = sell;
            }
        }

        return maxProfit;
    }
}