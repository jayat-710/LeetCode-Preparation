class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       HashSet <List<Integer>> set = new HashSet<>();
        
        if(nums.length==0)return new ArrayList<>(set);
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum==-nums[i]){
                  List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    
                    set.add(list);
                    j++; k--;
                }
                else if (sum< -nums[i]) j++;
                else if(sum> -nums[i])k--;
            }
        }
        
        return new ArrayList<>(set);
    }
}