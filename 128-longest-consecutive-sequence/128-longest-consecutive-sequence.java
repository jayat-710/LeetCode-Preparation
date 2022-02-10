class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1)){
                map.put(nums[i],map.get(nums[i]-1)+1);
            }
            else
            map.put(nums[i],1);
        }
        
        int max=0;
        for(int k:map.keySet()){
            max=Math.max(map.get(k),max);
        }
        
        return max;
    }
}