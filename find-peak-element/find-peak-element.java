class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;
        
         if(nums[0]>nums[1])
            return 0;
        int left=0;
        int right=nums.length-2;
        int mid=0;
        while(left<=right){
             mid= (left+right)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            }
            else if(nums[mid+1]>nums[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        
        return mid;
    }
}