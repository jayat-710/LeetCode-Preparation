class Solution {
    public int pivotIndex(int[] nums) {
        
        if (nums.length <=2)
            return -1;
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        
        int left=0;
        int right=sum;
        
        if(sum-nums[0]==0)
            return 0;
        
        for(int i=1;i<nums.length;i++){
            left+=nums[i-1];
            right=sum-left-nums[i];
            
            if(left==right)
                return i;
        }
        
        return -1;
    }
}