class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int sum=0;
         for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        int l =0;int r= sum;  int ans = Integer.MAX_VALUE;
        
        while(l<=r){
           int mid =(l+r)>>1;
            if(helper(arr,days,mid)==true){
                ans = Math.min(ans,mid);
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        
        return ans;
    }
    
    static boolean helper(int[] arr,int days,int x){
       
        int sum=0;int count=1;
        
        
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>x){
                return false;
            }
           sum+=arr[i];
            
            if(sum>x){
               count++;
                sum=0;
                sum+=arr[i];
            }
        }
        
        if(count>days){
            return false;
        }
        return true;
    }
}