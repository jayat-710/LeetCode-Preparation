class Solution {
    
    static int dp[]= new int[1000];
    static int dp1[]= new int[1000];
    public int rob(int[] nums) {
        
        if(nums.length==1)return nums[0];
        for(int i=0;i<=nums.length;i++){
            dp[i]=-1;
        }
         for(int i=0;i<=nums.length;i++){
            dp1[i]=-1;
        }
        System.out.println(helper2(nums,0,0));
        return Math.max(helper1(nums,0,0),helper2(nums,1,0));
    }
    
    static int helper1(int nums[],int i,int sum){
        
        if(i>=nums.length-1)return sum;
        
        if(dp[i]!=-1)return dp[i];
        
        int first=helper1(nums,i+2,sum)+nums[i];
        int second=helper1(nums,i+1,sum);
        
        return dp[i]=Math.max(first,second);
    }
    
    static int helper2(int nums[],int i,int sum){
        
        if(i>=nums.length)return sum;
         if(dp1[i]!=-1)return dp1[i];
        int first=helper2(nums,i+2,sum)+nums[i];
        int second=helper2(nums,i+1,sum);
        
        return dp1[i]=Math.max(first,second);
    }
}