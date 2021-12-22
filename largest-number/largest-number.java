class Solution {
    public String largestNumber(int[] nums) {
        String arr[]= new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Integer.toString(nums[i]);
        }
        String str="";
        Arrays.sort(arr,(a,b)->{
            long t1 =Long.parseLong(a+b);
            long t2 =Long.parseLong(b+a);
            
            if(t1>t2)return 1;
            else if (t2>t1)return -1;
            else return 0;
        });
        for(int i=nums.length-1;i>=0;i--){
           str+=arr[i];
            
            
        }
        
        if(str.charAt(0)=='0')return "0";
        
        return str;
    }
}