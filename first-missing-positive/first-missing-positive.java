class Solution {
    public int firstMissingPositive(int[] nums) {
        int max= Integer.MIN_VALUE;
        HashMap<Integer,Integer> map= new HashMap<>();
        
        
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        max=Math.max(max,nums[i]);   
       } 
        
        if(max<1)
            return 1;
        else{
        for(int i=1;i<=5000001;i++){
            if(!map.containsKey(i)){
                // System.out.println("ppppp");
                return i;
            }
        }
        }
        
        return 0;
    }
}