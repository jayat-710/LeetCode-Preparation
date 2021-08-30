class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
//         int i=n-k-1;
        k=k%n;
        int j=n-k;
        
        
        
//         while(j!=k){
            
//         }
        
       int ans[]=new int[n];
        int p=0;
        if(n==1){
            ans[0]=nums[0];
        }
        else{
        while(j<n){
            ans[p]=nums[j];
            j++;
            p++;
        }
        int z=0;
        while(p<n){
            ans[p]=nums[z];
           
            z++;
            p++;
        } 
        // System.out.print("[");
        for(int m=0;m<n;m++){
            nums[m]=ans[m];
        }
    }
}
}