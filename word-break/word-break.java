class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n =s.length();
        int dp[]= new int[s.length()+1];
        
        HashSet<String> set = new HashSet<>();
        for(String str : wordDict){
            set.add(str);
        }
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            String temp="";
            for(int j=i;j<n;j++){
                temp+=s.charAt(j);
                if(set.contains(temp)){
                    if(dp[j+1]==1){
                        dp[i]=1;
                    }
                }
            }
        }
        
        return (dp[0]==1)?true:false;
        
    }
}