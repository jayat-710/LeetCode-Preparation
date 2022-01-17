class Solution {
    static int dp[][];
    public int minScoreTriangulation(int[] arr) {
        int n =arr.length;
        dp= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
      return helper(0,n-1,arr);
    }
    
    static int helper(int si,int ei,int arr[]){
        
        if(ei-si<2)return 0;
        
        if(ei-si==2)return arr[ei]*arr[si]*arr[ei-1];
        
        if(dp[si][ei]!=-1)return dp[si][ei];
        
        
        
        int min=Integer.MAX_VALUE;
        for(int cp=si+1;cp<=ei-1;cp++){
        int left=helper(si,cp,arr);
        int right=helper(cp,ei,arr);
        
         min=Math.min(min,left+right+arr[si]*arr[cp]*arr[ei]);
        }
        
        return dp[si][ei]=min;
    }
}