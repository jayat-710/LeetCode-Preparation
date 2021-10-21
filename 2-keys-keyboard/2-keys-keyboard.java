class Solution {
    public int minSteps(int n) {
        
        int dp[]= new int[n+1];
        
        dp[0]=0;
        dp[1]=0;
        
        for(int i=2;i<=n;i++){
            
          int  min_=Integer.MAX_VALUE;
            
            for(int j=1;j<i;j++){
                if(i%j==0){
                   min_=Math.min(min_,dp[j]+i/j);
                }
            }
            
            dp[i]=min_;
        }
        
        return dp[n];
    }
}