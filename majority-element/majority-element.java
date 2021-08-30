class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int n = nums.length;
        
        int lp=0;int rp=1; int ret =nums[0];
        
        for(int i=1;i<n;i++){
            if(i==n-1){
                if(nums[rp]==nums[lp]);
                int temp=rp-lp+1;
                if(temp>max){
                    max=temp;
                    ret = nums[lp];
                    
                }
            }
            else{
            if(nums[rp]!=nums[lp]){
                // max= Math.max(rp-lp,max);
               
                int temp=rp-lp;
                if(temp>max){
                    max=temp;
                    ret = nums[lp];
                    
                }
                lp=rp;
                rp++;
            }
            else{
                rp++;
            }
        }
        }
        return ret;
    }
}