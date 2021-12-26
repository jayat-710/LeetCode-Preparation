class Solution {
    public int countVowelStrings(int n) {
        char arr[]={'a','e','i','o','u'};
       return solve(n,arr,0,"",0);
    }
    
    static int solve(int n,char arr[],int i,String str,int count){
        if(str.length()>n || i>=5)return 0;
        
        if(str.length()==n){
            // System.out.println(str +" "+count);
            count=count+1;
            return count;
        }
        int op1= solve(n,arr,i,str+arr[i],count);
            int op2=solve(n,arr,i+1,str,count);
        
        return op1+op2;
    }
}