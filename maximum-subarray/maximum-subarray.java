class Solution {
    public int maxSubArray(int[] nums) {
        int prev=0;
        int curr=0;
        
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            
            if(curr>prev){
                prev=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        int temp=Integer.MIN_VALUE;
        boolean allneg=false;
        for(int i : nums){
            if(i>0){
                allneg=true;
                break;
            }
            temp=Math.max(temp,i);
        }
        System.out.println(curr);
        if(prev==0 && !allneg){
            return temp;
        }
        
        return prev;
    }
    
}