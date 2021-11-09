class Solution {
    public int minMoves(int[] nums) {
        int m=Integer.MAX_VALUE;
        int ans=0;
        for(int i : nums){
            m=Math.min(m,i);
        }
        
        for(int i:nums)ans+=i-m;
        
        return ans;
    }
}