class Solution {
    static int dp[][][]= new int[100000][2][101];
   
    public int maxProfit(int k,int[] prices) {
        int bool=0; 
        for(int i=0;i<=prices.length;i++){
            for(int j=0;j<2;j++){
                for(int z=0;z<=100;z++)
                dp[i][j][z]=-1;
            }
        }
        return solve(0,prices,bool, k);
    }
    
    static int solve(int i, int price[],int bool,int k){
        if(i==price.length)
            return 0;
        if(dp[i][bool][k]!=-1){
           return dp[i][bool][k];
        }
        if(bool==0){
            int op1=(k>=1)?-price[i]+solve(i+1,price,1,k):0;     //mei ith wala kharidunga
            int op2 =solve(i+1,price,0,k);               //mei nhi lunga
        
            return  dp[i][bool][k]=Math.max(op1,op2);
        }
        else{
            
            int op1= price[i]+solve(i+1,price,0,k-1);     //mei ith wala bechunga
            int op2 =solve(i+1,price,1,k);               //mei nhi bechunga
        
            return dp[i][bool][k]= Math.max(op1,op2);         
        }
    }
}