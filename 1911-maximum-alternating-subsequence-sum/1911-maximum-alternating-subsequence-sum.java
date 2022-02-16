class Solution {
    static long dp[][];
    public long maxAlternatingSum(int[] nums) {
        dp= new long[nums.length][10];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        // Arrays.fill(dp,-1);
        return helper(nums,0,1);
    }
    
    static long helper(int nums[],int i,int k){
        
        if(i>=nums.length){
            // System.out.println(str+"->>"+sum);
            return 0;
        }
        if(dp[i][k]!=Integer.MIN_VALUE)return dp[i][k];
        
        long pick ;
        
        if(k==1){
            // bool=false;
            
            pick= helper(nums,i+1,0)+nums[i];
        }
        else{
            // bool=true;
            pick=helper(nums,i+1,1)-nums[i];
        }
        long unpick =helper(nums,i+1,k);
        
        return dp[i][k]= Math.max(pick,unpick);
    }
}