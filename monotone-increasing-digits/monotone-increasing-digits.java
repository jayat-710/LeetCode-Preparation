class Solution {
    public int monotoneIncreasingDigits(int n) {
        String str = Integer.toString(n);
        
        int temp=-1;
        
        for(int i=str.length()-1;i>0;i--){
            if(str.charAt(i)<str.charAt(i-1))temp=i-1;
            
        }
        while(temp-1>=0 && str.charAt(temp)==str.charAt(temp-1))temp--;
        System.out.println(temp);
        // int k=-1;
        // for(int i=0;i<str.length()-1;i++){
        //     if(str.charAt(i)<=str.charAt(i+1))k=i+1;
        // }
        
        if(temp==-1)return n;
        String ans="";
        for(int i=0;i<str.length();i++){
            if(i<temp){
                ans+=str.charAt(i);
            }
            else if(i==temp){
                ans+=Integer.toString((str.charAt(i)-'0')-1);
            }
            else{
                ans+="9";
            }
        }
        return Integer.parseInt(ans);
        // return 0;
    }
}