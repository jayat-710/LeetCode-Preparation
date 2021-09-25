class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map =  new HashMap<>();
        
        int prfx_sum =0; int count=0; map.put(0,1);
        for(int i=0;i<nums.length;i++){
            
            prfx_sum+=nums[i];
            

                if(map.containsKey(prfx_sum-k)){
                    count+=map.get(prfx_sum-k);
                   
                }
            
                   map.put(prfx_sum, map.getOrDefault(prfx_sum, 0)+1);
         
        
        }
        
        return count;
    }
}