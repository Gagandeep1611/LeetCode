package leetCode;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxprofit=0;
        for (int price : prices) {
            minprice=Math.min(minprice,price);
            maxprofit=Math.max(maxprofit,price-minprice);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
        BuySellStock stock = new BuySellStock();
        System.out.println(stock.maxProfit(array));
    }
}
