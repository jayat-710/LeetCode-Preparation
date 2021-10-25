class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int dp[][]= new int[coins.length+1][amount+1];
        
        for(int i=0;i<=coins.length;i++){
            for(int j=0;j<=amount;j++){
                if(i==0){
                    dp[i][j]=Integer.MAX_VALUE-1;
                }
                else if(j==0 && i!=0){
                    dp[i][j]=0;
                }
            }
        }
        
         for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                
                if(j-coins[i-1]>=0)
                dp[i][j]=Math.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
                
                else{
                  dp[i][j]=dp[i-1][j];  
                }
            }
         }
        
        return dp[coins.length][amount]==2147483646?-1:dp[coins.length][amount];
    }
}