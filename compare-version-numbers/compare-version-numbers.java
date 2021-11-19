class Solution {
    public int compareVersion(String str1, String str2) {
        String v1[] = str1.split("\\.");
        String v2[] = str2.split("\\.");
        
        for(int i=0;i<Math.max(v1.length,v2.length);i++){
            int a = (i<v1.length)? Integer.valueOf(v1[i]):0;
            int b = (i<v2.length)? Integer.valueOf(v2[i]):0;
            
            if(a>b){
                return 1;
            }
            if(b>a)return -1;
        }
        
        return 0;
        
    }
}