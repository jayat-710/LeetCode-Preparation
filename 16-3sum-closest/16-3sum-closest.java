class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
       int min=Integer.MAX_VALUE; 
        int ans=0;
       for(int k=0;k<arr.length-2;k++){
        int i=k+1;
        int j=arr.length-1;  
           
           while(i<j){
               if(arr[k]+arr[i]+arr[j]==target){
                   return target;
               }
               else if(arr[k]+arr[i]+arr[j]<target){
                   // min=Math.min(min,Math.abs(arr[k]+arr[i]+arr[j]-target));
                   
                   if(Math.abs((arr[k]+arr[i]+arr[j])-target)<min){
                       min=Math.abs((arr[k]+arr[i]+arr[j])-target);
                       ans=arr[k]+arr[i]+arr[j];
                   }
                   i++;
               }
               else{
                    if(Math.abs((arr[k]+arr[i]+arr[j])-target)<min){
                       min=Math.abs((arr[k]+arr[i]+arr[j])-target);
                       ans=arr[k]+arr[i]+arr[j];
                   }
                   j--; 
               }
           }
           
       }
        
        return ans;
    }
}