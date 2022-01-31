class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum=0;
        for(int i:nums){
            sum=(sum+i)%p;
        }
        if(sum==0)return 0;
        System.out.println(sum);
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        int tot=0;
        int min=nums.length;
        for(int j=0;j<nums.length;j++){
            tot=(tot+nums[j])%p;
            
            int rem=(tot-sum)%p;
            
            if(rem<0)rem+=p;
            
            if(map.containsKey(rem)){
                int i=map.get(rem);
                min=Math.min(min,j-i);
            }
            
            map.put(tot,j);
        }
        
        return min==nums.length?-1:min;
    }
}