class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n<=0)return false;
        while(n>1){
            int temp=n & 1;
            if(temp==1)return false;
           n= n>>>1;
        }
        
        return true;
    }
   
}