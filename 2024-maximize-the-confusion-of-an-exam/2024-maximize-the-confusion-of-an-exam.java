class Solution {
    public int maxConsecutiveAnswers(String str, int k) {
        // System.out.println(count('T',str,k));
        return Math.max(count('T',str,k),count('F',str,k));
    }
    
    static int count(char c,String str,int k){
        int i=0;int count=0;
        int max=0;
        
        for(int j=0;j<str.length();j++){
            // System.out.println(i+" "+j);
            if(str.charAt(j)==c){
                count++;
            }
            while(count>k){
                if(str.charAt(i)==c){
                count--;
               
                    
            }
                i++;
            }
            
            max=Math.max(j-i+1,max);
            
        }
        
        return max;
    }
}