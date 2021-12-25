class Solution {
   static int dp[][]= new int[101][10001];
    public boolean isSubsequence(String s, String t) {
       int count=0;
        int m=s.length()-1;
        int n=t.length()-1;
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++)dp[i][j]=-1;
        }
        int ans= solver(s,t,0,0,m,n);
        System.out.println(ans);
        return (ans==s.length());
    }
    
    static int solver(String s , String t,int i, int j,int m ,int n){
       
        // if(s.length()==0 || t.length()==0)return 0;
        
         if(i>=s.length()|| j>=t.length())return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        if(s.charAt(i)==t.charAt(j)) return dp[i][j]=1+solver(s,t,i+1,j+1,m,n);
        
        return dp[i][j]=Math.max(solver(s,t,i+1,j,m,n),solver(s,t,i,j+1,m,n));
    }
}