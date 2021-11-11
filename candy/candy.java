class Solution {
    public int candy(int[] arr) {
        int n = arr.length;
        
        if(n==1){
            return 1;
        }
       int arr1[] = new int[n];
        int arr2[]= new int[n];
        
        Arrays.fill(arr1,1);
        Arrays.fill(arr2,1);
        
          // for(int i:arr1){
          //     System.out.println(i);
          // }
        // System.out.println(arr[1]+" "+arr[2] );
        for(int i=1;i<n;i++){
            
            if(arr[i-1]<arr[i]){
                
                arr1[i]=1+arr1[i-1];
            }
              // System.out.println(arr1[i]);
        }
        
         for(int i=n-2;i>=0;i--){
            if(arr[i+1]<arr[i]){
                arr2[i]=arr2[i+1]+1;
            }
//              else if(arr[i+1]==arr[i]){
                 
//              }
        }
        int sum=0;
         for(int i=0;i<n;i++){
             
             // System.out.println(Math.max(arr1[i],arr2[i]));
             
           sum+=Math.max(arr1[i],arr2[i]);
        }
//         for(int i=0;i<n;i++){
            
//         }
        
        return sum;
    }
}