class Solution {
    public void sortColors(int[] nums) {
        int count1=0;int count0=0;int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)count0++;
            if(nums[i]==1)count1++;
            if(nums[i]==2)count2++;
        }
        
        int i=0;
        
        while(count0-->0){
            nums[i]=0;
            i++;
        }
         while(count1-->0){
            nums[i]=1;
            i++;
        }
         while(count2-->0){
            nums[i]=2;
            i++;
        }
    }
}