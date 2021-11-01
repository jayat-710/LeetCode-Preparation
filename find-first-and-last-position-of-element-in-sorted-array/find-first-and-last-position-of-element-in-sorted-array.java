class Solution {
    public int[] searchRange(int[] arr, int target) {
       
        
        int ans[] = new int[2];
        
        //starting
        
        
        
        int l=0;int h=arr.length-1;
        int x=-1;
        
        while(l<=h){
            int mid=(l+h)/2;
            
            if(arr[mid]==target){
                x=mid;
                h=mid-1;
            }
            else if(arr[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        
        ans[0]=x;
        
        //ending
          l=0; h=arr.length-1;
        int y=-1;
        
           while(l<=h){
            int mid=(l+h)/2;
            
            if(arr[mid]==target){
                y=mid;
                l=mid+1;
            }
            else if(arr[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        
        ans[1]=y;
        
        return ans;
        
        
        
    }
}