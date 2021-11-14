class Solution {
     static int dp[][]=new int[110][110];
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length-1;
        int n= arr[0].length-1;
         for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){
                dp[i][j]=-1;
            }
        }
        
        return helper(m,n,0,arr);
    }
     static int helper(int m,int n,int count,int arr[][]){
        
        if(m==0 && n==0){
            if(arr[m][n]!=1)
            count++;
            return dp[m+1][n+1]=count;
        }
        
        if(dp[m+1][n+1]!=-1){
            return dp[m+1][n+1];
        }
        
        if(m<0){
            return 0;
        }
        if(n<0){
            return 0;
        }
         if(arr[m][n]==1){
            return 0;
        }
       
        
        return dp[m+1][n+1]=helper(m-1,n,count,arr)+helper(m,n-1,count,arr);
    }
}