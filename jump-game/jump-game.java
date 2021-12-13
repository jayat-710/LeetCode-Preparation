class Solution {
    static int dp[]=new int[100000];
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int i=0;
        Arrays.fill(dp,-1);
        return solve(nums,i,n);
    }
    
    static boolean solve(int nums[],int i,int n){
       
        if(i>=n-1)return true;
        
        if( nums[i]==0){
            dp[i]=0;
            return false;
        }
        if(dp[i]!=-1)return dp[i]==1;
        boolean res=false;
        for(int j=1;j<=nums[i];++j){
           if(solve(nums,i+j,n)){
               dp[i]=1;
               res=true;
               break;
           }
        }
        dp[i]=0;
        return res;
    }
}