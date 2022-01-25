class Solution {
    public int[] decrypt(int[] code, int k) {
        int ans[]= new int[code.length];
        int n =code.length;
        if(k==0){
            Arrays.fill(code,0);
        }
        
        else if(k>0){
            for(int i=0;i<code.length;i++){
                int j=i+1;
                int sum=0;
                int s=0;
                while(s<k){
                    sum+=code[j%n];
                    j++;
                    s++;
                }
               ans[i]=sum; 
            }
            
        }
        else{
            int code2[]= new int[code.length];
            int p=code.length-1;
            for(int i=0;i<code.length;i++){
                code2[p]=code[i];
                p--;
            }
            k=k*-1;
           for(int i=0;i<code.length;i++){
                int j=i+1;
                int sum=0;
                int s=0;
               
                while(s<k){
                    sum+=code2[j%n];
                    j++;
                    s++;
                }
               ans[i]=sum; 
            }
            // return code2;
             for(int i=0;i<code.length;i++){
                code2[i]=ans[n-1];
                n--;
            }
            return code2;
        }
        
        return ans;
    }
}