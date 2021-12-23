class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums); int sum=0;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int temp=0;
        for(int i=nums.length-1;i>=0;i--){
            temp+=nums[i];
            list.add(nums[i]);
            if(sum-temp<temp)return list;
        }
        
        return list;
    }
}