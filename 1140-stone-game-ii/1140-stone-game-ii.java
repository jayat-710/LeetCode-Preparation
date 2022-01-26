class Solution {
   static int dp[][];
    public int stoneGameII(int[] arr) {
        dp=new int[arr.length][2*arr.length+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        int ans=helper(arr,0,1);
        int sum=0;
        for(int i:arr)sum+=i;
        return (sum+ans)/2;
    }
    static int helper(int arr[],int i,int m){
        if(i==arr.length)return 0;
        if(dp[i][m]!=Integer.MIN_VALUE) return dp[i][m];
        int ans=Integer.MIN_VALUE;
        int sum=0;
       
        for(int x=0;x<2*m;x++){
            int idx=x+i;
            if(idx>=arr.length)continue;
            sum+=arr[idx];
            int score=sum-helper(arr,idx+1,Math.max(x+1,m));
            ans=Math.max(ans,score);
            // System.out.println(ans);
        }
        
        return dp[i][m]=ans;
    }
}