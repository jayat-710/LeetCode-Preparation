class Solution {
    public int longestSubsequence(String s, int k) {
        
        int count0=0; int count1=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count0++;
            }
        }
        
        // System.out.println(count0);
        
        long temp=0;
        
        int i=s.length()-1;
        // int temp=0;
        while(temp<=k && i>=0){
            
            if(s.charAt(i)=='1'){
                temp+=(long)Math.pow(2,s.length()-i-1);
                
                if(temp<=k)count1++;
                
               
            } i--;
        }
        
        
        return count0+count1;
    }
    
    static int pow(int p,int n){
        int m=2;
        int ans=1;
        while(n!=0){
            
            int bit=n&1;
            if(bit==1){
                ans*=bit*m;
            }
            
            m=m*m;
            n=n>>1;
        }
        
        return ans;
    }
}