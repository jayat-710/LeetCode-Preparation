class Solution {
    public int splitArray(int[] arr, int m) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int l=0;
        int r=sum;
        int ans=Integer.MAX_VALUE;
        
        
        while(l<=r){
            int mid=(l+r)/2;
            
            if(helper(arr,m,mid)==true){
                r=mid-1;
                ans=Math.min(mid,ans);
            }
            else{
                l=mid+1;
            }
        }
        
        // System.out.println(ans);
        int my_ans=0; int last=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            my_ans+=arr[i];
            if(my_ans>ans){
                my_ans-=arr[i];
                i--;
                last=Math.max(my_ans,last);
                my_ans=0;
            }
             last=Math.max(my_ans,last);
        }
       return last; 
        
    }
    static Boolean helper(int arr[],int m,int sum){
        int i=0;
        while(m-->0 && i<arr.length){
            
            int temp=0;
            while(temp<=sum && i<arr.length){
                temp+=arr[i];
                i++;
            }
            if(temp>sum){
                i--;
            }
           
            
        } if(i!=arr.length){
                return false;
            }
        
        return true;
    }
}