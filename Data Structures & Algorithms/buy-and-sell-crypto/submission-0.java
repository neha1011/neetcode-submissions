class Solution {
    public int maxProfit(int[] prices) {
         int buyPrice = prices[0];
        int profit = 0;
        for(int x : prices){
            if(x < buyPrice){
                buyPrice = x;
            }else{
                if(x-buyPrice > profit){
                    profit = x - buyPrice;
                }
            }
        }
        return profit;
    }
}
