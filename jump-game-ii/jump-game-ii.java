class Solution {
    public int jump(int[] nums) {
        int dp[]= new int[nums.length];
        
        dp[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]==0){
                dp[i]=-1;
            }
            else{
                int ans=1000000000;
                for(int j=1;j<=nums[i];j++){
                    
                    if(i+j>=nums.length){
                        continue;
                    }
                    else if(dp[i+j]==-1){
                        continue;
                    }
                    else{
                       ans=Math.min(dp[i+j],ans);
                    }
                    
                   
                }
                dp[i]=ans+1;
                
            }
            
        }
        
        return dp[0];
    }
}