class Solution {
    public int minimumDeletions(String s) {
        int countb=0;
        int min=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
              countb++;
            }
            else min++;
            
              min=Math.min(min,countb);
        }
    
//         for(int i=s.length()-1;i>=0;i--){
//              if(s.charAt(i)=='b'){
//                 min=Math.min(min,counta);
//             }
//             else counta++;
//         }
        return min;
       // return (min==Integer.MAX_VALUE)?0:min;
    }
}