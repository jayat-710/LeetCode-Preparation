class Solution {
    static int dp[];
    public int wiggleMaxLength(int[] nums) {
        dp= new int[nums.length];
        Arrays.fill(dp,-10);
        return helper(nums,-1,-1,0);
    }
    static int helper(int nums[],int prev,int sign,int i){
        
        if(i>=nums.length || nums[i]==prev){
            return 0;
        }
        
        if(dp[i]!=-10)return dp[i];
        
        if(sign==1 && nums[i]-prev>0 || sign==0 && nums[i]-prev<0 )
            return 0;
        
        return dp[i]=Math.max(helper(nums,nums[i],(prev==-1)?-1:(nums[i]-prev>0)?1:0,i+1)+1,helper(nums,prev,sign,i+1));
    }
}