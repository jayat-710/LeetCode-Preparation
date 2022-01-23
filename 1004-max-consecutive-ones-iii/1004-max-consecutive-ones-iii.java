class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;int j=0;
        int max=0; int temp=0;
        while(j<nums.length ){
            // System.out.println(i+" "+j);
            // if(nums[j]==1){max=Math.max(max,j-i+1);j++;  }
            // else{
                // temp++;
//                 if(temp==k){
                    
//                     // max=Math.max(max,j-i+1);
//                     j++;
//                 }
            if(nums[j]==0)temp++;
             if(temp>k){
                    while(temp>k){
                        
                        if(nums[i]==0){
                            temp--;
                        }
                        i++;
                    }
                    // j++;
                }
                // else{
                //     j++;
                // }
            max=Math.max(max,j-i+1);
            j++;
                
            }
            // if(j==nums.length-1)break;
        // }
        
        return max;
    }
}

// temp=1 2 3 