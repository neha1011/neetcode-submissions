class Solution {
    public int coinChange(int[] coins, int amount) {
          int n = coins.length;
        int[]dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<n;i++){
            if(coins[i]<=amount)
            dp[coins[i]]=1;
        }
        for(int i=1;i<=amount;i++){
            for(int j=0;j<n;j++){
               if(i-coins[j]>0  && dp[i-coins[j]] != Integer.MAX_VALUE){
                dp[i] = Math.min(dp[i-coins[j]] + 1,dp[i]);
               }
            }
        }
        return dp[amount] != Integer.MAX_VALUE ? dp[amount] : -1 ;
    }
}
