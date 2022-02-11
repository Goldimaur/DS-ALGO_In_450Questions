package final450DSA.arrays;

import java.util.Scanner;

/*
121. Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */
public class BestTimeToBuySellStock_16_leetcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        BestTimeToBuySellStock_16_leetcode b= new BestTimeToBuySellStock_16_leetcode();
        System.out.println(b.maxProfit(array));
    }

    // 7 1 5 3 6 4 ( tc=o(n^2) sc= o(1))
    // 1,5 = 4 , 1,3 =2, 1,6 =5, 1 , 4=3
    // 5,6 =1 , 3,6 = 2 , 3,4=1 [profit= [ 4,2,5,3, 1,2,1] ]
    // optimal (linear traversal)
    // mini = 7  profit=0
    // mini = 1 [ profit= 5-1=4 , 3-1=2 , 6-1=5 , 1-4=3) max=5)
    // mini=5
    // o(n) sc=o(1)
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprice=0;
        for (int i=0;i<prices.length;i++){
            if(prices[i]< minprice)
                minprice=prices[i];
            else if (prices[i] - minprice > maxprice)
                maxprice=prices[i]-minprice;
        }
        return maxprice;
    }
}
