class Solution {
    public boolean makeStringsEqual(String s, String target) {
        if(target.equals(s))return true;
        int count1=0;
        int count0=0;
        
        int tcount1=0;
        int tcount0=0;
        
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='1'){count1++;}
            if(s.charAt(i)=='1' && target.charAt(i)=='0'){tcount0++;}
            
           if(s.charAt(i)=='0' && target.charAt(i)=='1')count0++;
        }
        
        
        // for(int i=0;i<target.length();i++){
        //     if(target.charAt(i)=='1') tcount1++;
        //     else tcount0++;
        // }
        
        if(tcount0<=count0 && tcount0!=0)return true;
        
        if(count1<=tcount0)return false;
        
        return true;
    }
}