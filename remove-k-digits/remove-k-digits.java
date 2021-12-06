class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length()-k;
        if(num.length()<=k) return "0";
        
        int t=-1;
        char[] s = num.toCharArray();
        for(int i=0;i<num.length();i++){
            while(t>=0 && s[t]>s[i] && k>0 ){
                t--; k--;
            }
            
            
            t++; s[t]=s[i];
        }
        
        int start=0;
        while(s[start]=='0' && start<n){
            start++;
        }
        String ans=""; 
        for(int i=start;i<n;i++) ans+=s[i];
        
        if(ans=="")return "0";
        
        return ans;
    }
}