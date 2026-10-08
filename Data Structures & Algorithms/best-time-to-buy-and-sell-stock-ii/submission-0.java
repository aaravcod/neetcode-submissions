class Solution {
    public int maxProfit(int[] prices) {
        int buy,sell,profit=0;
        for(int i=0;i<(prices.length-1);i++){
            if(prices[i]<prices[i+1]){
                buy=prices[i];
                sell=prices[i+1];
                profit=profit+sell-buy;
            }
        }
        return profit;
        
    }
}