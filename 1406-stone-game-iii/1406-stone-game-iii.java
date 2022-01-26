class Solution {
    static int dp[];
    public String stoneGameIII(int[] arr) {
        dp= new int[arr.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        int value=helper(arr,0);
        System.out.println(value);
        
        // if(value==0)return "Tie";
        
        // return (value>0)?"Alice":"Bob";
        if(value>0)return "Alice";
        else if(value<0)return "Bob";
        else return "Tie";
    }
    
    static int helper(int arr[],int i){
        
        
        if(i>=arr.length)return 0;
        
        // int sum=0; //alice ///(i+1,,,,arr.length-1)>sum?-ve:+ve
        if(dp[i]!=Integer.MIN_VALUE)return dp[i];
        
        int value=Integer.MIN_VALUE;
        
        // if(i+1<arr.length){
            // sum+=arr[i];
            value=Math.max(value,arr[i]-helper(arr,i+1));
        // }
         if(i+1<arr.length){
             // sum+=arr[i+1];
            value=Math.max(value,arr[i]+arr[i+1]-helper(arr,i+2));
        }
         if(i+2<arr.length){
            // sum+=arr[i+2];
            value=Math.max(value,arr[i]+arr[i+1]+arr[i+2]-helper(arr,i+3));
        }
        
        return dp[i]=value;
    }
}