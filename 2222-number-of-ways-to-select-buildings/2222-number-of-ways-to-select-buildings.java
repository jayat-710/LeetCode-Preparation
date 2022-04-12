class Solution {
    public long numberOfWays(String s) {
     int z[]= new int[s.length()];
     int o[]= new int[s.length()];
    
        int one=0;
        int zero=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zero++;
                    
                }
            else{
               one++;
            }
           z[i]=zero;
            o[i]=one;
        }
        
        long ans =0;
        
        for(int i=1;i<s.length();i++){
             if(s.charAt(i)=='0'){
                long temp=o[i-1]*(one-o[i-1]);
                 ans+=temp;
            }
             else{
                long temp=z[i-1]*(zero-z[i-1]);
                 ans+=temp;
            }
        }
        
        
        return ans;
        
    }
}