class Solution {
    static int dp[][]=new int[101][101];
    public int uniquePaths(int m, int n) {
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }
        return helper(m,n,0);
    }
    static int helper(int m,int n,int count){
        if(m==1 && n==1){
            count++;
            return dp[m][n]=count;
        }
        
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        
        if(m<=0){
            return 0;
        }
        if(n<=0){
            return 0;
        }
        
        return dp[m][n]=helper(m-1,n,count)+helper(m,n-1,count);
    }
}