class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer , Integer> map =  new HashMap<>();
        
        int prfx_sum =0; int count=0; map.put(0,1);
        for(int i=0;i<nums.length;i++){
            
            prfx_sum+=nums[i];
            
            // if(nums[i]==0){
            //     count++;
            // }
            
           int rem = prfx_sum%k;
            
            if(rem<0)
                rem+=k;

                if(map.containsKey(rem)){
                    count+=map.get(rem);
                   
                }
            
                   map.put(rem, map.getOrDefault(rem, 0)+1);
         
        
        }
        
        return count;
    }
}
