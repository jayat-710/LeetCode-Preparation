class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prod=1;
        int cnt_zero=0;
        
        int ans[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0)cnt_zero++;
            
            else
                prod=prod*nums[i];
                
        }
        
        if(cnt_zero>1)return ans;  //case 3
        
        else if(cnt_zero==1) //case 2
        {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0)ans[i]=prod;
                
                
            }
        }
        
        else //case 1
        {
            for(int i=0;i<ans.length;i++){
                ans[i]=prod/nums[i];
            }
        }
        
        return ans;
    }
}