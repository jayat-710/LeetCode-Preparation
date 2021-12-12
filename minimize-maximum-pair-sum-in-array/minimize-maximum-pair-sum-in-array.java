class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = Integer.MIN_VALUE;
        int i=0; int j=nums.length-1;
        while(i<j){
            sum=Math.max(sum,nums[i]+nums[j]);
            i++;j--;
        }
        
        return sum;
    }
}