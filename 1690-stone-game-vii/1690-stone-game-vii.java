class Solution {
   static int dp[][];
    public int stoneGameVII(int[] stones) {
        int n=stones.length;
        dp= new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        return helper(stones,0,stones.length);
    }
    static int helper(int arr[],int s,int e){
        if(s>=e){
            return 0;
        }
        
        // int ans=Integer.MIN_VALUE;
        if(dp[s][e]!=Integer.MIN_VALUE) return dp[s][e];
        int sum=0;
        for(int i=s;i<e;i++){
            sum+=arr[i];
        }
        
        int op1=(sum-arr[e-1])-helper(arr,s,e-1);
        int op2=(sum-arr[s])-helper(arr,s+1,e);
        
        return dp[s][e]= Math.max(op1,op2);
    }
}