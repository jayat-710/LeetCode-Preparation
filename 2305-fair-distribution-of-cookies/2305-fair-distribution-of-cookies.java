class Solution {
    public int distributeCookies(int[] cookies, int k) {
        int child[]= new int[k];
        return helper(child,cookies,k,0);
    }
    static int helper(int child[],int arr[],int k,int i){
        
        
        if(i>=arr.length){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<k;j++){
                max=Math.max(max,child[j]);
            }
            return max;
        }
        
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<k;j++){
            child[j]+=arr[i];
            ans=Math.min(ans,helper(child,arr,k,i+1));
            child[j]-=arr[i];
            // ans=Math.min(ans,helper(child,arr,k,i+1));
        }
        
        return ans;
    }
}