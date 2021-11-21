class Solution {
    static int dp[][]=new int[600][600];
    public int maxCoins(int[] nums) {
       
        //mcmm problem
        
        // i , j , k
        //mene ek point liya k, mei yeh bolunga ki mera jo i...k ---- k...i usme mei yeh check karunga ki kaha k ko bithane se mujhe max milega
        int n =nums.length;
        
        for(int i=0;i<=n+2;i++){
            for(int j=0;j<=n+2;j++){
                dp[i][j]=-1;
            }
        }
        return solve(-1,n,nums,n,dp);
        
        
    }
    
    static int solve(int i,int j,int nums[],int n,int dp[][]){
        
        if(i+1==j)
        return 0;
            
        int left= (i==-1)?1:nums[i];
        int right = (j==n)?1:nums[j];
        
        int max =0;
        
        if(dp[i+1][j+1]!=-1){
            return dp[i+1][j+1];
        }
        
        for(int k=i+1;k<j;k++){
            max = Math.max(solve(i,k,nums,n,dp)+solve(k,j,nums,n,dp)+left*nums[k]*right,max);
        }
        
        return dp[i+1][j+1]=max;
    }
}