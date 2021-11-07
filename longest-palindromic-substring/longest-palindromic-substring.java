class Solution {
    public String longestPalindrome(String s) { 
      String dp[][]= new String[s.length()][s.length()];
    
        return helper(0,s.length()-1,s,dp);
        
    
    }
    
    static String helper(int i,int j,String s,String dp[][]){
        if(i==j){
            return s.substring(i,j+1);
            
        }
        if(i>j){
            return "";
        }
        
        if(dp[i][j]!= null){
            return dp[i][j];
        }
        
        if(s.charAt(i)==s.charAt(j)){
            String temp = helper(i+1,j-1,s,dp);
            
            if(temp.length()==j-i-1){
                return dp[i][j]=s.substring(i,j+1);
                
            }
        }
        
        String op1 = helper(i,j-1,s,dp);
        String op2 =helper(i+1,j,s,dp);
        
        if(op1.length()>op2.length()){
            return dp[i][j]=op1;
        }
        else{
            return dp[i][j]=op2;
        }
    }
}