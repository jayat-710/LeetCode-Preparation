class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int dp[][]= new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 // if(matrix[i][j]=0){
//                     dp[i][j]=-1;
                    
                
//             }
//         }
        
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j]==0){
//                     dp[i][j]=0;
                    
//                 }
//             }
//         }
//         for(int i=0;i<n;i++){
           
//             //dp[m-1][i]=matrix[m-1][i];
           
            
//              if(matrix[m-1][i]==1){
//                 dp[m-1][i]+=1; 
//              }
//             System.out.print(matrix[m-1][i]+"->"+dp[m-1][i]+" ");
//         }
//         System.out.println(" ");
//         for(int i=0;i<m;i++){
//              if(matrix[i][n-1]==1)
//             dp[i][n-1]=1;
//         }
//          for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
                
                
//               System.out.print(dp[i][j]+" ");
                    
                
//             }
//              System.out.println(" ");
//         }
        
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                
                if(i==m-1 && j==n-1){
                    if(matrix[i][j]=='0'){
                        dp[i][j]=0;
                    }else{
                          dp[i][j]=1;
                     }
                }
                else if(i==m-1){
                     if(matrix[i][j]=='0'){
                        dp[i][j]=0;
                    }else{
                          dp[i][j]=1;
                     }
                }
                else if(j==n-1){
                     if(matrix[i][j]=='0'){
                        dp[i][j]=0;
                    }else{
                          dp[i][j]=1;
                     }
                    
                }
                else{
                    if(matrix[i][j]=='0'){
                        dp[i][j]=0;
                    }
                    else{
                         dp[i][j]=Math.min(Math.min(dp[i][j+1],dp[i+1][j+1]),dp[i+1][j])+1;
                    }
                }
                
                // dp[i][j]=Math.min(Math.min(dp[i][j+1],dp[i+1][j+1]),dp[i+1][j])+1;
            }
        }
        
        int ans=Integer.MIN_VALUE;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                
                ans=Math.max(ans,dp[i][j]);
                    
                
            }
        }
        
//          for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
                
                
//               System.out.print(dp[i][j]+" ");
                    
                
//             }
//              System.out.println(" ");
//         }
          // System.out.println(dp[m-1][0]);
        
        return ans*ans;
    }
}