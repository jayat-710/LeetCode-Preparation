class Solution {
    public int minPathSum(int[][] grid) {
        
        int sr=grid.length;
        int sc=grid[0].length;
        
        int dp[][]=new int[sr][sc];
        
        int ans = leastCost(grid,0,0,dp);
        return ans;
        
    }
    static int leastCost(int arr[][],int sr,int sc,int dp[][]){
       if(sr>=arr.length || sc>=arr[0].length){
           return Integer.MAX_VALUE;
       }
       
       if(sr==arr.length-1 && sc==arr[0].length-1){
        //   sum+=arr[sr][sc];
        //   return 
           return arr[sr][sc];
       }
       
       if(dp[sr][sc]!=0){
           return dp[sr][sc];
       }
       
       int sum_right = leastCost(arr,sr+1,sc,dp);
        int sum_left = leastCost(arr,sr,sc+1,dp);
        
        
        int ans=Math.min(sum_right,sum_left)+arr[sr][sc];
        return dp[sr][sc]=ans;
    }
}