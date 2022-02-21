package final450DSA.arrays;
/*
In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day, whereas the second transaction can only start after the first one is complete (Buy->sell->Buy->sell). Given stock prices throughout the day, find out the maximum profit that a share trader could have made.

Examples:

Input:   price[] = {10, 22, 5, 75, 65, 80}
Output:  87
Trader earns 87 as sum of 12, 75
Buy at 10, sell at 22,
Buy at 5 and sell at 80
Input:   price[] = {2, 30, 15, 10, 8, 25, 80}
Output:  100
Trader earns 100 as sum of 28 and 72
Buy at price 2, sell at 30, buy at 8 and sell at 80
Input:   price[] = {100, 30, 15, 10, 8, 25, 80};
Output:  72
Buy at price 8 and sell at 80.
Input:   price[] = {90, 80, 70, 60, 50}
Output:  0
Not possible to earn.
 */
public class MaxProfitByBuyingAndSellingAtmostTwice_25 {
    //dp  tc=o(n)  sc=o(n)
    // simple approach   tc=o(n)  sc=o(1)

        static int maxProfit(int price[], int n)
        {
            int profit[] = new int[n];
            for (int i = 0; i < n; i++)
                profit[i] = 0;

            int max_price = price[n - 1];
            for (int i = n - 2; i >= 0; i--) {

                if (price[i] > max_price)
                    max_price = price[i];

                profit[i] = Math.max(profit[i + 1],
                        max_price - price[i]);
            }

            int min_price = price[0];
            for (int i = 1; i < n; i++) {
                // min_price is minimum
                // price in price[0..i]
                if (price[i] < min_price)
                    min_price = price[i];

                profit[i] = Math.max(
                        profit[i - 1],
                        profit[i] + (price[i] - min_price));
            }
            int result = profit[n - 1];
            return result;
        }

        public static void main(String args[])
        {
            int price[] = { 2, 30, 15, 10, 8, 25, 80 };
            int n = price.length;
            System.out.println("Maximum Profit = "
                    + maxProfit(price, n));
        }


}
