class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(ans,candidates,target,list,0);
        
        
        return ans;
        
        
        
    }
    
    public void helper(List <List<Integer>> ans , int[] candidates, int target,List <Integer> list,int i){
        if(i>=candidates.length){
            if(target==0)
             ans.add(new ArrayList<>(list));
            return;
        }
        if(target<0){
            
            return;
        }
        
        if(candidates[i]<=target){
            list.add(candidates[i]);
            helper(ans,candidates,target-candidates[i],list,i);
            list.remove(list.size()-1);
        }
        
        helper(ans,candidates,target,list,i+1);
        
    }
}