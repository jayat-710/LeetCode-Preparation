class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(nums[0]>=0)
        return nums[n-1]*nums[n-2]*nums[n-3];
        // for(int i:nums){System.out.println(i);}
        int temp= Math.max(nums[0]*nums[1]*nums[2],nums[0]*nums[1]*nums[n-1]);
        int ans =Math.max(temp,nums[n-1]*nums[n-2]*nums[n-3]);
            return ans;
    }
}