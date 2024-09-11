public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice=prices[0];
        for(int i=1; i<prices.length; i++){
            if(buyPrice<prices[i]){
                profit = Math.max(profit, prices[i]-buyPrice);
            } else{
                buyPrice = prices[i];
            }

        }
        return profit;

    }
}
