class Solution {
    static int dp[][]= new int[100000][2];
   
    public int maxProfit(int[] prices,int k) {
        int bool=0; 
        for(int i=0;i<=prices.length;i++){
            for(int j=0;j<2;j++){
               
                dp[i][j]=-1;
            }
        }
        return solve(0,prices,bool, k);
    }
    
    static int solve(int i, int price[],int bool,int k){
        if(i==price.length)
            return 0;
        if(dp[i][bool]!=-1){
           return dp[i][bool];
        }
        if(bool==0){
            int op1=-price[i]+solve(i+1,price,1,k);     //mei ith wala kharidunga
            int op2 =solve(i+1,price,0,k);               //mei nhi lunga
        
            return  dp[i][bool]=Math.max(op1,op2);
        }
        else{
            
            int op1= price[i]-k+solve(i+1,price,0,k);     //mei ith wala bechunga
            int op2 =solve(i+1,price,1,k);               //mei nhi bechunga
        
            return dp[i][bool]= Math.max(op1,op2);         
        }
    }
}