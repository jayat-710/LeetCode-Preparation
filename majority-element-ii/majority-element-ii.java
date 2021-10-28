class Solution {
    public List<Integer> majorityElement(int[] nums) {
     
        int n = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(int i=0;i<n;i++){
            int temp= map.get(nums[i]);
            if(temp==0){
                continue;
            }
            if(temp>n/3){
                list.add(nums[i]);
                map.put(nums[i],0);
            }
        }
        
        return list;
        
    }
}