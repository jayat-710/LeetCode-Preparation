class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int max=nums[0];
        int start=-1;int end=-2;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=max){
                
                max=nums[i];
            }
            else{
                end=i;
            }
        }
        int min=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<=min){
                min=nums[i];
            }
            else{
                start=i;
            }
        }
        
        return end-start+1;
    }
}