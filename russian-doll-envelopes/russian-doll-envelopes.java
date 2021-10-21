class Solution {
    public int maxEnvelopes(int[][] arr) {
        
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        
        int dp[]= new int[arr.length];
        
        for(int i=0;i<dp.length;i++){
            
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(arr[i][0]>arr[j][0] && arr[i][1]>arr[j][1]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int ans=-1;
        
        for(int i=0;i<dp.length;i++){
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}