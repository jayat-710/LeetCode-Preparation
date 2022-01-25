class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)return false;
        
        boolean possible=false; int i;
        for(i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                possible=true;
                
                break;
            }
            
            if(arr[i]==arr[i-1])return false;
            
            if(arr[i]<arr[i-1] && arr[i]<arr[i+1])return false;
        }
        
        if(!possible)return false;
        
        boolean ans=true;
        for(int j=i+1;j<arr.length;j++){
            // System.out.println(j);
            if(arr[j]>arr[j-1]){
                ans=false;
                break;
            }
            
            if(arr[j]==arr[j-1])return false;
        }
        if(ans)return true;
        
        return false;
        
    }
}