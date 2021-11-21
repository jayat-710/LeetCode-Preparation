class Solution {
    public boolean isPowerOfFour(int n) {
     
        if(n==1)
            return true;
        
        int count=0;
        int count1=0;
        while(n>0){
            int x =n & 1;
            
            // System.out.println(x);
            if(x ==0 ){
                count++;
            }
            count1++;
            n=n>>1;
        }
        
        if(count==count1-1 && count%2==0 && count>0)
            return true;
        
        return false;
        
    }
}