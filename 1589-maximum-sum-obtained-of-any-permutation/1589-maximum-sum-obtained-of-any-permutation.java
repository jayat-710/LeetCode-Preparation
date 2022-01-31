class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int count[]= new int[nums.length];
        
        int prfx[]= new int[nums.length];
        int mod=1000000007;
        for(int i=0;i<requests.length;i++){
            int left=requests[i][0];
            int right=requests[i][1];
            
            count[left]++;
            
            if(right+1!=nums.length){
                count[right+1]--;
            }
            
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        // for(int i:count){
        //     System.out.println(i);
        // }
        
        Arrays.sort(count);
        Arrays.sort(nums);
        long sum=0;
        for(int i=0;i<count.length;i++){
            long temp=1;
            sum=(sum+(temp*count[i]%mod)*(nums[i]%mod))%mod;
        }
        
        return (int)sum;            
    }
}