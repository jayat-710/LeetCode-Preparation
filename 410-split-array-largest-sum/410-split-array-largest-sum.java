class Solution {
    public int splitArray(int[] nums, int m) {
        
        int max=0; int sum=0;
        for(int it:nums){
            max=Math.max(max,it);
            sum+=it;
        }
        
        
        
        int l=max;
        int h=sum;
        
        if(nums.length==m)return max;
        
        while(l<h){
            int mid=l+(h-l)/2;
            if(isPos(nums,mid)<=m){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return h;
    }
    static int isPos(int nums[],int mid){
        
        int sum=0;
        int cnt=1;
        
        for(int it:nums){
            sum+=it;
            
            if(sum>mid){
                cnt++;
                sum=it;
            }
        }
        
        return cnt;
        
        
    }
}