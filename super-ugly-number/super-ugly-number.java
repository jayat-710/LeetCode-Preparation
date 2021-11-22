class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        
        int dp[]= new int[n+1];
        int pointer[]=new int[primes.length];
        Arrays.fill(pointer,1);
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<primes.length;j++){
                
                min =Math.min(min,dp[pointer[j]]*primes[j]);
                
                
            }
            dp[i]=min;
            for(int j=0;j<primes.length;j++){
                
              if(dp[pointer[j]]*primes[j]==min)
                  pointer[j]++;
                
            }
        }
        
        
        return dp[n];
    }
}