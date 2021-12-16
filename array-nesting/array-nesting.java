class Solution {
    public int arrayNesting(int[] nums) {
        int vis[]= new int[nums.length];
        
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(vis[i]==0){
                max=Math.max(max,solve(nums,i,vis,0));
            }
        }
        
        return max;
    }
    static int solve(int nums[],int i ,int vis[],int count){
        if(vis[i]==1)return count;
        
        vis[i]=1;
        return solve(nums,nums[i],vis,count+1);
    }
}