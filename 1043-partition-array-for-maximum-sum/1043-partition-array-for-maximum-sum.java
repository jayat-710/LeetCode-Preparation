class Solution {
    static int dp[];
    public int maxSumAfterPartitioning(int[] arr, int k) {
        dp=new int[arr.length];
        Arrays.fill(dp,-1);
     return helper(arr,k,0);   
    }
    
    static int helper(int arr[],int k,int i){
        if(i>=arr.length)return 0;
        
        if(dp[i]!=-1)return dp[i];
        
        int max=arr[i];
        int sum=0;
        for(int j=i;j<i+k && j<arr.length;j++){
            max=Math.max(max,arr[j]);
            sum=Math.max(sum,max*(j-i+1)+helper(arr,k,j+1));
            
        }
        
        return dp[i]=sum;
    }
}