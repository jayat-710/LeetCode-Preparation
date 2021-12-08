class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     ArrayList <List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        
        rec(nums,0,list,ans);
        
        
        
        return ans;
    }
    
    static void rec(int[] nums,int i,ArrayList<Integer> list,ArrayList <List<Integer>> ans){
        
        if(i==nums.length){
            ans.add((list));
            return;
        }
        
        rec(nums,i+1,new ArrayList(list),ans);
        list.add(nums[i]);
        rec(nums,i+1,new ArrayList(list),ans);
        
        
    }
}