class Solution {
    public int nthUglyNumber(int n) {
        
        int dp[]=new int[n+2];
        dp[1]=1;
        
        int p1=1;int p2=1;int p3=1;
        
        for(int i=2;i<=n;i++){
            //dp[i]
            
            int op1=2*dp[p1];
            int op2=3*dp[p2];
            int op3 =5*dp[p3];
            
            dp[i]=Math.min(op1,Math.min(op2,op3));
            if(dp[i]==op1)p1++;
            if(dp[i]==op2)p2++;
            if(dp[i]==op3)p3++;
        }
        return dp[n];
    }
}