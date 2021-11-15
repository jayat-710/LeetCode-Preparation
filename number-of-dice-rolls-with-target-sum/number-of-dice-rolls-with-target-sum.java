class Solution {
    static int dp[][]= new int[31][1001];
    public int numRollsToTarget(int d, int f, int target) {
        
        for(int i=0;i<=d;i++){
            for(int j=0;j<=target;j++){
                dp[i][j]=-1;
            }
        }
        return helper(d,f,target);
    }
    
    static int helper(int m,int n,int target){
        if(target<0){
           return 0;
       }
        if(target==0 && m==0){
           return 1;
        }
        if(m<=0){
            return 0;
        }
        
        if(dp[m][target]!=-1){
            return dp[m][target];
        }
     
        int ans =0;
        for(int k=1;k<=n;++k){
         if(target>=k)
         ans= (ans+helper(m-1,n,target-k))%1000000007;
        }
      
        return dp[m][target]= ans;
    }
}