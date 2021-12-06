class Solution {
    public String longestCommonPrefix(String[] strs) {
//         for(int i=0;i<strs.length;i++){
//             strs[i]=sortString(strs[i]);
            
//         }
        
        String temp=strs[0];
        if(strs.length==1){
            return temp;
        }
        
        for(int i=1;i<strs.length;i++){
             temp = help(temp,strs[i]);
            
            if(temp=="")
                return ""; 
        }
        
        return temp;
    }
    
    public String help (String str1, String str2){
        String temp="";
        int min = Math.min(str1.length(),str2.length());
        
        for(int i=0;i<min;i++){
            if(str1.charAt(i)==str2.charAt(i))
                temp+=str1.charAt(i);
            
            else break;
        }
        
        return temp;
    }
    
    // static String sortString(String str) {
    //     char []arr = str.toCharArray();
    //     Arrays.sort(arr);
    //     return String.valueOf(arr);
    // }
}