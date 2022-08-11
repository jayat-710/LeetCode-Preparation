class Solution {
    public int minSwaps(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)count+=1;
        }
        if(count==nums.length)return 0;
        if(count==0)return 0;
        int i=0;
        int j=count-1;
        int sum=0;
        for(int k=0;k<count;k++){
            if(nums[k]==1)sum+=1;
            
        }
        
        // System.out.println(nums.length+" "+count+" "+sum);
        
          if(nums[i]==1){
                sum-=1;
            }i++;  j++; 
            if(nums[j]==1)sum+=1;
        
      
        int min=count-sum;
        while(j!=count-1){
            if(nums[i]==1){
                sum-=1;
            } 
            i=(i+1)%nums.length;
            j=(j+1)%nums.length;
            if(nums[j]==1)sum+=1;
            // int temp=count-sum;
            // System.out.println(i+" "+j+" "+temp);
           
            
            
            min=Math.min(min,count-sum);
        }
       
        return min;
    }
}