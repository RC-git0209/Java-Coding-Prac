
public class MaxProfitStocks {
	public static int maxProfit(int[] prices) {
		if(prices == null || prices.length < 2) {
			return 0; // No profit possible
		}
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price : prices) {
			if(price < minPrice) {
				minPrice = price;
			}
			
			int profit = price - minPrice;
			
			if (profit > maxProfit) {
				maxProfit = profit;
			}
		}
		return maxProfit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices = {1, 2, 9, 7, 6};
		System.out.println("Maximum Profit: " + maxProfit(prices));

}
}