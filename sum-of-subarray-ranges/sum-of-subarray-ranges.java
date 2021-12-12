class Solution {
    public long subArrayRanges(int[] nums) {
        
        long sum=0;
        for(int i=0;i<nums.length;i++){
            long max=nums[i];long min=nums[i];  
            for(int j=i;j<nums.length;j++){
                if(nums[j]>max)max=nums[j];
                if(nums[j]<min)min=nums[j];
                
                sum+=(max-min);
            }
        
        
        }
        
        return sum;
    }
}