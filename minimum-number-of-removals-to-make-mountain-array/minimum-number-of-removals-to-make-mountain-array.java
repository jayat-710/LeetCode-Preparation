class Solution {
    public int minimumMountainRemovals(int[] nums) {
          int dp[]= new int[nums.length];
        dp[0]=1;
        int dp1[]= new int[nums.length];
        dp1[nums.length-1]=1;
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
        
        ///////////////////////
        
        for(int i=dp1.length-2;i>=0;i--){
            for(int j=dp1.length-1;j>i;j--){
                if(nums[i]>nums[j]){
                    dp1[i]=Math.max(dp1[i],dp1[j]);
                }
            }
            
            if(dp1[i]==0){
                dp1[i]=1;
            }
            else{
                dp1[i]++;
            }
        }
        
        
        
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++){
            // System.out.print(dp[i]+" ");
            if(dp[i]!=1 && dp1[i]!=1)
            ans=Math.max(ans,dp[i]+dp1[i]);
        }
        
        return nums.length-(ans-1);
    }
}