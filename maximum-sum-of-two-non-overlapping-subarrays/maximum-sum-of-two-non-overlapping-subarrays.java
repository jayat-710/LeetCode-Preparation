class Solution {
    public int maxSumTwoNoOverlap(int[] arr, int x, int y) {
        
        int n = arr.length; 
        int sum=0;
        
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        
        for(int i=0;i<n;i++){
            if(i<x){
                sum+=arr[i];
                dp1[i]=sum;
            }
            
            else{
                sum+=arr[i]-arr[i-x];
                
                dp1[i]= Math.max(dp1[i-1],sum);
            }
        }
        
        sum=0;
        
        for(int i=n-1;i>=0;i--){
            if(i+y>=n){
                sum+=arr[i];
                dp2[i]=sum;
            }
            else{
                sum+=arr[i]-arr[i+y];
                
                dp2[i]=Math.max(dp2[i+1],sum);
            }
        }
        
        int ans=0;
        
        for(int i=x-1;i<n-y;i++){
            ans=Math.max(dp1[i]+dp2[i+1],ans);
        }
        
     sum=0;
        
        dp1=new int[n];
        dp2=new int[n];
        
        
        for(int i=0;i<n;i++){
            if(i<y){
                sum+=arr[i];
                dp1[i]=sum;
            }
            
            else{
                sum+=arr[i]-arr[i-y];
                
                dp1[i]= Math.max(dp1[i-1],sum);
            }
        }
        
        sum=0;
        
        for(int i=n-1;i>=0;i--){
            if(i+x>=n){
                sum+=arr[i];
                dp2[i]=sum;
            }
            else{
                sum+=arr[i]-arr[i+x];
                
                dp2[i]=Math.max(dp2[i+1],sum);
            }
        }
        
        // ans=0;
        
        for(int i=y-1;i<n-x;i++){
            ans=Math.max(dp1[i]+dp2[i+1],ans);
        }
        
        return ans;
        
    }
}