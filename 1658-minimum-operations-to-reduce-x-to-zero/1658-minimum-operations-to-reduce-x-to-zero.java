class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int i=0;
        int j=1;
        
        int sum=0;
        for(int k:nums){
            sum+=k;
        }
        if(sum<x)return -1;
        
        sum-=x;
        int temp=nums[0];
        int max=-1;
        while(i<j && j<n){
            if(temp>=sum){
                
                while(temp>sum){
                    temp-=nums[i];
                    i++;
                }
                if(temp==sum)
                max=Math.max(max,j-i);
            }
            
            temp+=nums[j];
            j++;
        }
        if(temp==sum)
        max=Math.max(max,j-i);
        
        else if(temp>=sum){
                
                while(temp>sum){
                    temp-=nums[i];
                    i++;
                }
                if(temp==sum)
                max=Math.max(max,j-i);
            }
        
        return (max==-1)?-1:n-max;
    }
}