class Solution {
    public int firstMissingPositive(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i+1);
        }
        int n =nums.length;
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        
        return n+1;
    }
}