class Solution {
    public int longestPalindromeSubseq(String s1) {
        
        int m =s1.length();
        int n= s1.length();
        
        String s2="";
        
        for(int i=m-1;i>=0;i--)
         s2 +=s1.charAt(i);
        
        int t[][]= new int[m+1][n+1];
        
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
                
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]= 1+t[i-1][j-1];
                }
                
                else {
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        
        return t[m][n];
    }
}