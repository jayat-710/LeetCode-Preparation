class Solution {
   static Boolean dp[][];
    public boolean checkValidString(String s) {
        dp=new Boolean[s.length()][s.length()];
        
        return helper(s,0,0);
    }
    
    static boolean helper(String str,int i,int open){
        
        if(i==str.length()){
           return open==0;
        }
        if(dp[i][open] != null)return dp[i][open];
        if(str.charAt(i)=='('){
            
           return dp[i][open] = helper(str,i+1,open+1);
        }
        else if(str.charAt(i)==')'){
            return dp[i][open] = open>0 && helper(str,i+1,open-1);
        }
        else {
            return dp[i][open] =helper(str,i+1,open)||helper(str,i+1,open+1) || open>0&&helper(str,i+1,open-1);
        }
    }
}