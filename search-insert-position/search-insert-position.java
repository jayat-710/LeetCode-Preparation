class Solution {
    public int searchInsert(int[] arr, int target) {
        int low=0;int high=arr.length-1;
        int ans=0;
        while(low<=high){
            int mid=(high+low)/2;
            
            if(target==arr[mid]){
                return mid;
            }
            else if(arr[mid]<target){
                ans=mid+1;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        
        return ans;
    }
}