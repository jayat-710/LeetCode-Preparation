class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        int n = nums.length;
        int max = (int)Math.pow(2,n);
        
        for(int i=0;i<max;i++){
            int temp=i;
            int idx=nums.length;
            
            List<Integer> ans = new ArrayList<>();
            
            while(temp>0){
                idx--;
                
                // if(idx<0)
                //     break;
                int x=temp & 1;
                if(x==1){
                    ans.add(nums[idx]);
                }
                
                temp=temp>>>1;
                
            }
            list.add(ans);
        }
        
        return list;
        
    }
}