class Solution {
    
    static int dp[];
    public int numDecodings(String s) {
        dp= new int[110];
        Arrays.fill(dp,-1);
        
        return helper(s,0);
    }
    
    static int helper(String s,int i){
    
        if(i==s.length())return 1;
        
        if(s.charAt(i)=='0')return 0;
    
        if(dp[i]!=-1)return dp[i];
    
    
    int ways2=0;   
    int ways1=helper(s,i+1);
        
        if(i+1<s.length()){
     String temp=s.substring(i,i+2);  
    if(Integer.parseInt(temp)>9 && Integer.parseInt(temp)<=26){
      ways2=helper(s,i+2);
    }}
        
        return dp[i]=ways1+ways2;
        
        
    }
    
}