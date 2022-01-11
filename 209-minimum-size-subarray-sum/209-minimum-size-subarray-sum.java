class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count=0;
        int min=Integer.MAX_VALUE;
        int curr=0;
        int i =0;
        int j=0;
        while(j<nums.length){
            curr+=nums[j];
            if(curr==target){
                min=Math.min(j-i+1,min);
                j++;
                
            }
            else if(curr<target){
                j++;
                
            }
            else if (curr>target){
                
              while(curr>target){
                   min=Math.min(j-i+1,min);
                  curr-=nums[i];
                  i++;
              }
               if(curr==target){
                min=Math.min(j-i+1,min);
                  
                j++;
                
            }
            else if(curr<target){
                j++;
                
            }
            }
            
        }
        if(min==Integer.MAX_VALUE){
            min=0;
        }
        return min;
    }
}