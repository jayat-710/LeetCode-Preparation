class Solution {
    public int arrangeCoins(int n) {
        
        
        long sum=0;
        int i=0; int ans=0;
        while(sum<n){
            ++i;
            
           
            sum+=(long)i;
            // i++;
            ans=Math.max(ans,i);
        }
        // System.out.println(sum);
        
        if(sum==n)
            return ans;
       
        
        return ans-1;
    }
}