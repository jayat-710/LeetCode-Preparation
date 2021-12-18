class Solution {
    public int[] productExceptSelf(int[] nums) {
        
       int prod=1; int cnt0=0;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){ 
            if(nums[i]==0)cnt0++;
            
            else
            prod=prod*nums[i];
        }
        
        if(cnt0>1)return ans;
        
        else if(cnt0==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0)ans[i]=prod;
            }
        }
        
        ///I will get my total product
       else{ 
        for(int i=0;i<nums.length;i++){
            ans[i]=prod/nums[i];
        }
       }
        
         return ans;
            
        }
        
}