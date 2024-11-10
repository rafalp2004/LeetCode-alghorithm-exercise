class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int firstIndex=0;
        int secondIndex=1;
        while(secondIndex<prices.length){
            if(prices[firstIndex]>prices[secondIndex]){
                firstIndex++;
                secondIndex++;
            } else{
                while(secondIndex < prices.length-1 && prices[secondIndex]<prices[secondIndex+1]){
                    secondIndex++;
                }
                   profit+=prices[secondIndex]-prices[firstIndex];
                    firstIndex=secondIndex;
                    secondIndex++;
            }
        }
        return profit;
        
    }
}
