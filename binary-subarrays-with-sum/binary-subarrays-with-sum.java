class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int n = nums.length;
        int sum=0; int count=0;
        
        for(int i=0;i<n;i++){
            
            sum+=nums[i];
            if(sum==goal){
                count++;
                //count+=map.get(sum);
            }
            
            
            if(map.containsKey(sum-goal)){
                count+=map.get(sum-goal);
            }
           
            
            map.put(sum,map.getOrDefault(sum,0)+1);
            
            // count+=map.get(sum)-1;
            
        }
        
        return count;
    }
}