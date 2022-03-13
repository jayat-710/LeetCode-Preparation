class Solution {
    public int maximumTop(int[] nums, int k) {
       if (k%2!=0 && nums.length==1)return -1;
        
        long max=-1;
        for(int i=1;i<=Math.min(nums.length,k-1);i++){
            max=Math.max(max,nums[i-1]);
        }
        
        // System.out.println(max);
        
        if(k+1<=nums.length){
            max=Math.max(max,nums[k]);
        }
        
        
        
        return (int)max;
    }
}