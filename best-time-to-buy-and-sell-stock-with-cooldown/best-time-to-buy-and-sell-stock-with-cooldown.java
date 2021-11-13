class Solution {
    static int dp[][][]= new int[100000][2][2];
   
    public int maxProfit(int[] prices) {
        int bool=0; 
        for(int i=0;i<=prices.length;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++)
                dp[i][j][k]=-1;
            }
        }
        return solve(0,prices,bool,0);
    }
    
    static int solve(int i, int price[],int bool,int cool){
        if(i==price.length)
            return 0;
        if(dp[i][bool][cool]!=-1){
           return dp[i][bool][cool];
        }
        if(bool==0){
            
            
            int op1= (cool==0)?-price[i]+solve(i+1,price,1,0):0;  
                                                   //mei ith wala kharidunga
            int op2 =solve(i+1,price,0,0);               //mei nhi lunga
        
            return dp[i][bool][cool]= Math.max(op1,op2);
        }
        else{
            
            int op1= price[i]+solve(i+1,price,0,1);     //mei ith wala bechunga
            int op2 =solve(i+1,price,1,0);               //mei nhi bechunga
        
            return dp[i][bool][cool]=Math.max(op1,op2);         
        }
    }
}