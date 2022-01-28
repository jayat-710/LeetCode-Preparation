class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1 ) return;
        int j=nums.length-1; int i=nums.length-2;
    while(i>=0){
        if(nums[i]>=nums[i+1]){
            i--;
        }
        else
        break;
    }
        // System.out.println(i);
        
        if(i>=0){
            while(nums[i]>=nums[j])j--;
            swap(nums,i,j);
            
        }
        
        reverse(nums,i+1,nums.length-1);
    }
    
     void reverse(int arr[],int i,int j){
        while(i<=j){
            swap(arr,i,j);
            i++;j--;
        }
    }
    
     void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}