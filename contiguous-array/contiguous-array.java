class Solution {
    public int findMaxLength(int[] nums) {
        
        int n = nums.length;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
            
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum=0; int ans=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
           sum+=nums[i];
            // System.out.println("Ddddd");
            if(map.containsKey(sum)){
                
                int temp =map.get(sum);
                ans=Math.max(ans,i-temp);
            }
            else{
                map.put(sum,i);
            }
        }
        
        
        return ans;
    }
}