class Solution {
    public int triangularSum(int[] nums) {
        int t=nums.length;
        while(t>1){
            for(int i=0;i<t-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
           t--; 
        }
        
        return nums[0];
    }
}