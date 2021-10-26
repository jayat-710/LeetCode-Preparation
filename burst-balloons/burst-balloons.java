class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int dp[][]= new int[n][n];
        
        //gap strategy
        
        for(int gap=0;gap<n;gap++){
            for(int i=0,j=gap;j<n;i++,j++){
                int max = Integer.MIN_VALUE;
                for(int k=i;k<=j;k++){
                    int left = k==i?0 : dp[i][k-1];
                    int right= k==j?0 : dp[k+1][j];
                    
                    int val = (i==0?1:nums[i-1]) *nums[k]*(j==n-1?1:nums[j+1]);
                    
                    max = Math.max(max,val+left+right);
                } dp[i][j]=max;
            }
            
           
        }
        
        return dp[0][n-1];
    }
}