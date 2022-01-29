class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;int j=0;int sum=0;
        
        int max=0;
        
        for(j=0;j<nums.length;j++){
            
            sum+=nums[j];
            
            while((j-i+1)*nums[j]-sum>k){
                sum-=nums[i];
                i++;
            }
            max=Math.max(j-i+1,max);
            // j++;
        }
        return max;
    }
}