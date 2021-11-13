class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        
        int mini[]= new int[prices.length];
        int maxum[]= new int[prices.length];
        
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            mini[i]=min;
        }
        
         
        for(int i=prices.length-1;i>=0;i--){
            max=Math.max(max,prices[i]);
            maxum[i]=max;
        }
        int ans=0;
         for(int i=0;i<prices.length;i++){
             ans=Math.max(ans,Math.abs(mini[i]-maxum[i]));
         }
        return ans;
    }
}