class Solution {
    static int dp[][];
    public int minCut(String s) {
        int n=s.length();
        dp= new int[n+1][n+1];
        
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        
        return helper(s,0,n-1);
    }
    
    static int helper(String s,int si,int ei){
        // if(si>=s.length() || ei>=s.length())return 100;
       
         if(dp[si][ei]!=-1)return dp[si][ei];
        if(si>=ei)return dp[si][ei]= 0; if(pal(s,si,ei))return dp[si][ei]= 0;
        
        int min=Integer.MAX_VALUE;
        
       
        
        for(int cp=si;cp<ei;cp++){
            
            if(pal(s,si,cp)==false)continue;
            
            int left=helper(s,si,cp);
            int right=helper(s,cp+1,ei);
            
            min=Math.min(min,left+right+1);
        }
        
        
        return dp[si][ei]=min;
    }
    
    static boolean pal(String str,int i,int j){
        // j=j-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))return false;
            
            i++; j--;
        }
        
        return true;
    }
}