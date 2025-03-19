package array;

public class BestTimeToBuyAndSellStock {
	
	/**
	 * Calculates the maximum profit that can be achieved from a single buy and sell transaction.
	 *
	 * The function takes an array of stock prices where each element represents the stock price on a given day.
	 * It determines the maximum possible profit by finding the lowest price to buy and the highest price to sell
	 * after the buy day.
	 *
	 * @param prices An array of integers representing stock prices on different days.
	 * @return The maximum profit that can be obtained from one buy-sell transaction.
	 *         Returns 0 if no profit can be made.
	 *
	 * Example:
	 * Input: [7, 1, 5, 3, 6, 4]
	 * Output: 5 (Buy at 1, sell at 6)
	 *
	 * Time Complexity: O(n), where n is the number of days (prices.length).
	 * Space Complexity: O(1), as only a few variables are used.
	 */
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }

}
