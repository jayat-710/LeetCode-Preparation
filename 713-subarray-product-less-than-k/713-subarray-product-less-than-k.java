class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0)return 0;
       
        int max=0;
        int prod=1;
        int i=0;
        for(int j=0;j<nums.length;j++){
            prod*=nums[j];
            while(i<=j && prod>=k){
                prod/=nums[i];
                i++;
            }
            max+=(j-i+1);
        }
        // System.out.println(max);
        return max;
    }
}