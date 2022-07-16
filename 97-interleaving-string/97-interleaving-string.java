class Solution {
    static Boolean dp[][];
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())return false;
        dp = new Boolean[110][110];
        
        for(int i=0;i<dp.length;i++){
            for(int j =0;j<dp[0].length;j++){
                dp[i][j]=null;
            }
        }
        return helper(s1,s2,s3,0,0);
    }
    
    static boolean helper (String s1,  String s2 , String s3, int i, int j){
        
        if(i>=s1.length() && j>= s2.length()){
            return true;
        }
        
        if(dp[i][j]!=null)return dp[i][j];
        
        if(i<s1.length() && j<s2.length() && s1.charAt(i)==s3.charAt(i+j) && s2.charAt(j)==s3.charAt(i+j)){
            return dp[i][j]=helper(s1,s2,s3,i+1,j) ||  helper(s1,s2,s3,i,j+1);
        }
        
        if(i<s1.length() && s1.charAt(i)==s3.charAt(i+j)){
            boolean f1 = helper(s1,s2,s3,i+1,j); 
            
            if(f1)return dp[i][j]= true;
        }
        
        if(j<s2.length() && s2.charAt(j)==s3.charAt(i+j)){
            boolean f1 = helper(s1,s2,s3,i,j+1); 
            
            if(f1)return dp[i][j]=true;
        }
        
        return dp[i][j]=false;
        
        
    }
}