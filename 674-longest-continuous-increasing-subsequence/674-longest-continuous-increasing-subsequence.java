class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int dp[]= new int[nums.length+1];
        Arrays.fill(dp,1);
        
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                dp[i]=dp[i-1]+1;
            }
            
            max=Math.max(max,dp[i]);
        }
        
    return max;
    }
}