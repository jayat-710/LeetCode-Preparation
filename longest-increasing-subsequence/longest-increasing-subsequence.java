class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]= new int[nums.length];
        dp[0]=1;
        
        // Arrays.fill(nums,1);
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]);
                }
            }
            
            if(dp[i]==0){
                dp[i]=1;
            }
            else{
                dp[i]++;
            }
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++){
            // System.out.print(dp[i]+" ");
            ans=Math.max(ans,dp[i]);
        }
        
        return ans;
    }
}