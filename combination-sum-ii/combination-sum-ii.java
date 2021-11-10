class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(ans,candidates,target,list,0);
        
        
        return ans;
        
        
        
    }
    
    public void helper(List <List<Integer>> ans , int[] candidates, int target,List <Integer> list,int i){
        // if(i>candidates.length-1){
            if(target==0){
             ans.add(new ArrayList<>(list));
            return;
            }
        if(target<0){
            
            return;
        }
        
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1])
                continue;
        if(candidates[j]>target)break;
        // if(candidates[i]<=target){
            list.add(candidates[j]);
            helper(ans,candidates,target-candidates[j],list,j+1);
            list.remove(list.size()-1);
        }
        
        // helper(ans,candidates,target,list,i+1);
        
    }
}