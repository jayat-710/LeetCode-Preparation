class Solution {
    public int countSquares(int[][] matrix) {
       int dp[][]= new int[matrix.length][matrix[0].length]; 
         for(int i=matrix.length-1;i>=0;i--){
            for(int j=matrix[0].length-1;j>=0;j--){
                if(i==matrix.length-1 || j==matrix[0].length-1)
                {
                    dp[i][j]=matrix[i][j];
                }
                else if(matrix[i][j]==0)dp[i][j]=0;
                else
                dp[i][j]=1+Math.min(dp[i+1][j],Math.min(dp[i][j+1],dp[i+1][j+1]));
            }
        }
        int sum=0;
        for(int i=0; i<=matrix.length-1;i++){
            for(int j=0; j<=matrix[0].length-1;j++){
                System.out.print(dp[i][j]+" ");
               sum+=dp[i][j];
            }
            System.out.println("");
        }
        
        
        return sum;
        
        
    }
}