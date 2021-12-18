class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int arr[]= new int[2];
        int left=0;
        int right=nums.length-1;
        
        while(left<right){
            if(nums[left]+nums[right]==target){
                System.out.println(left+ " "+ nums[left]+" "+nums[right]+" "+target);
                arr[0]=left+1;
                arr[1]=right+1;
                break;
            }
            
            else if(nums[left]+nums[right]>target)right--;
            
            else left++;
        }
        
        return arr;
    }
}