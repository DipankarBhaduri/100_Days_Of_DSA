package _09_Day_23_May_2023;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        Best_Time_to_Buy_and_Sell_Stock1 best_Time_to_Buy_and_Sell_Stock1 = new Best_Time_to_Buy_and_Sell_Stock1();
        int profit = best_Time_to_Buy_and_Sell_Stock1.maxProfit(prices);
        System.out.println(profit);
    }
}

class Best_Time_to_Buy_and_Sell_Stock1 {
    public int maxProfit(int[] prices) {
        int buyingPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int val = prices[i];
            int currMax = val > buyingPrice ? val - buyingPrice : maxProfit;
            maxProfit = currMax > maxProfit ? currMax : maxProfit;
            buyingPrice = buyingPrice > val ? val : buyingPrice;
        }

        return maxProfit;
    }
}
