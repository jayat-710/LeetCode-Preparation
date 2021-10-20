class Solution {
    static int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        count=0;
        helper(nums,target,0,0);
        return count;
    }
    
    public  void helper(int []arr,int target,int i,int sum){
        if(sum==target && i==arr.length){
            count++;
        }
        if(i>=arr.length){
            return;
        }
        
        helper(arr,target,i+1,sum+(-1)*arr[i]);
        helper(arr,target,i+1,sum+arr[i]) ;
    }
}