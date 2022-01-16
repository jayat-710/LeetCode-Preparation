class Solution {
   static int dp[][][];
    public int findMaxForm(String[] strs, int m, int n) {
        dp= new int[strs.length+1][m+1][n+1];
        return helper(strs,m,n,0);
    }
    static int helper(String strs[],int z,int o,int i){
        
        if(i>=strs.length || (z==0 && o==0)){
            return 0;
        }
        if(dp[i][z][o]>0)return dp[i][z][o];
        int count[]=countxo(strs[i]);
        
        int consider=0;
        
        if(z>=count[0] && o>=count[1])
         consider=helper(strs,z-count[0],o-count[1],i+1)+1;
        int skip=helper(strs,z,o,i+1);
        
        return dp[i][z][o]=Math.max(consider,skip);
    }
    
    static int[] countxo(String str){
        int count[]= new int[2];
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0')count[0]++;
            else count[1]++;
        }
        
        
        return count;
    }
}