class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
     HashSet <List<Integer>> ans = new HashSet<>();
        ArrayList<Integer> list= new ArrayList<>();
        
        boolean vis[]= new boolean[nums.length];
        rec(nums,vis,list,ans);
        ArrayList <List<Integer>> res = new ArrayList<>(ans);
        
        
        return res;
    }
    
    static void rec(int[] nums,boolean vis[],ArrayList<Integer> list,HashSet <List<Integer>> ans){
        
        if(list.size()==nums.length)
        {
            ans.add(new ArrayList(list));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(!vis[i])
            {   
                vis[i]=true;
                list.add(nums[i]);
                rec(nums,vis,list,ans);
                vis[i]=false;
                list.remove(list.size()-1);
            
            }
        }
    }
}