class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
       // if(nums.length==1)return 0;
        int min=nums[n-1]-nums[0];
        for(int i=1;i<nums.length;i++){
            int left=Math.max(nums[n-1]-k,nums[i-1]+k);
            int right=Math.min(nums[0]+k,nums[i]-k);
            
            
            
            min=Math.min(min,left-right);
        }
        
        return min;
    }
}