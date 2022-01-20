class Solution {
    static int vis[];
    static int count;
    public boolean canReach(int[] arr, int i) {
       vis=new int[arr.length];
        count=0;
        // System.out.println(arr.length);
        boolean ans= helper(arr,i);
        // System.out.println(count);
        
        return ans;
    }
    
    static boolean helper(int arr[],int i){
        
        // if(count>arr.length+2)return false;
       
        
        if(i>=arr.length ||i<0)return false;
        
        if(arr[i]==0)return true;
         if(vis[i]==1)return false;
        vis[i]=1;
        // count++;
        return helper(arr,i+arr[i]) | helper(arr,i-arr[i]);
    }
    
}