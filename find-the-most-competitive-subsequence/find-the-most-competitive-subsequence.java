class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int ans[] = new int[k];int n = nums.length;
        
        Stack <Integer> stk = new Stack<>();
        for(int i=0;i<n;i++){
            
             while(stk.size() >0 && stk.peek() > nums[i] && n-i-1 >= k-stk.size()){
                 stk.pop();
             }
            if(stk.size()<k){
                stk.push(nums[i]);
            }
            
            }
        int i=k-1;
        while(k-->0){
            ans[i]=stk.peek(); stk.pop(); i--;
        }
        
        return ans;
        }
    }