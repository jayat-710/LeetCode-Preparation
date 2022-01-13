class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int n=arr.length;
        if(arr.length==1)return arr;
       
        int x=-1; int p=0; int min=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>min){
                p=i;
                x=1;
                
                break;
            }
            min=Math.min(min,arr[i]);
        }
        
        if(x==-1)return arr;
        
        int idx=-1;
        int min2=-1;
        
        for(int k=p+1;k<arr.length;k++){
            if(arr[k]>min2 && arr[k]<arr[p]){
                idx=k;
                min2=arr[k];
            }
        }
        
        int temp=arr[idx];
        arr[idx]=arr[p];
        arr[p]=temp;
        
        return arr;
        
    }
}