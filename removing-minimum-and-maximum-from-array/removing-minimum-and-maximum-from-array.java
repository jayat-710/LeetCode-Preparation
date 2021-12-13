class Solution {
    public int minimumDeletions(int[] nums) {
        int mx_indx=-1; int min_indx=-1; int max=Integer.MIN_VALUE;int min=Integer.MAX_VALUE;
        
        if(nums.length==1)return 1;
            System.out.println(nums.length);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                mx_indx=i;
            }
            if(nums[i]<min){
                min=nums[i];
                min_indx=i;
            }
        }
        
         if(mx_indx==nums.length/2 ||   min_indx ==nums.length/2){
          int mi = Math.max(mx_indx,min_indx);
          int mx = Math.min(mx_indx,min_indx); 
             
             return Math.min(mi+1,nums.length-mx);
         }
        
        if(mx_indx <=nums.length/2 && min_indx<=nums.length/2){
            System.out.println("1");
            int mi = Math.max(mx_indx,min_indx);
            return mi+1;
        }
        else if(mx_indx >nums.length/2 && min_indx>nums.length/2){
           System.out.println("2");
            int mi = Math.min(mx_indx,min_indx);
            return nums.length-mi;
        }
        
        else{
             int mi = Math.max(mx_indx,min_indx);
            // return mi;
            System.out.println("3");
                 System.out.println(mx_indx    +"."+  min_indx  );
              // int mj= Math.min(mx_indx,min_indx);
             return   Math.min( Math.min( Math.min(nums.length-mx_indx+min_indx+1  ,nums.length-min_indx+mx_indx+1 ) , Math.max(mx_indx,min_indx)+1),nums.length-Math.min(mx_indx,min_indx));
        }
        
        
    }
}