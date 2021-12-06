class Solution {
    public boolean isLongPressedName(String name, String typed) {
     
        int m1 =name.length();
        int m2 =typed.length();
        
        if(m2<m1)
            return false;
        
        int j=0;
        for(int i=0;i<m2;i++){
            if(j<m1 && name.charAt(j)==typed.charAt(i))
                j++;
            
            else{
                if(i>0 && typed.charAt(i)!=typed.charAt(i-1) || i==0) return false;
            }
        }
        return j==m1;
    }
}