class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long sum=0;
        long ans=Long.MAX_VALUE;
        
        for(int i=0;i<beans.length;i++){
            sum+=beans[i];
        }
        
        for(int i=0;i<beans.length;i++){
            Long value = sum-(beans[i]*(long)(beans.length-i));
            
            ans=Math.min(ans,value);
           
        }
        
        return ans;
    }
}