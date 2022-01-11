class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int dp[][]= new int[nums1.length+1][nums2.length+1];
        int res=0;
        for(int i=1;i<=nums1.length;i++){
            for(int j=1;j<=nums2.length;j++){
                
                if(nums1[i-1]==nums2[j-1])
                dp[i][j]=dp[i-1][j-1]+1;
                
                else
                    dp[i][j]=0;
                
                res =Math.max(res,dp[i][j]);
            }
        }
        
        
        
        return res;
    }
    
    static int helper(int arr1[],int arr2[],int i,int j,int dp[][]){
       if(i==arr1.length || j==arr2.length){
           return 0;
       }
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        // int count;
        int temp=0;
        if(arr1[i]==arr2[i]){
            dp[i][j]=helper(arr1,arr2,i+1,j+1,dp)+1;
        }
        else{
            dp[i][j]=0;
             temp=Math.max(helper(arr1,arr2,i+1,j,dp),helper(arr1,arr2,i,j+1,dp));
        }
        dp[i][j]=Math.max(dp[i][j],temp);
        
       return dp[i][j];
    }
}