class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     HashSet <List<Integer>> ans = new HashSet<>();
        ArrayList<Integer> list= new ArrayList<>();
        Arrays.sort(nums);
        rec(nums,0,list,ans);
        
        ArrayList<List<Integer>> res = new ArrayList<>(ans);
        
        return res;
    }
    
    static void rec(int[] nums,int i,ArrayList<Integer> list,HashSet <List<Integer>> ans){
        
        if(i==nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        
        rec(nums,i+1,list,ans);
        list.add(nums[i]);
        rec(nums,i+1,list,ans);
        
        list.remove(list.size()-1);
    }
}





