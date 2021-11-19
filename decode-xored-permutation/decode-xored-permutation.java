class Solution {
    public int[] decode(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n+1];
        
        int xor=0;
        for(int i=1;i<=n+1;i++){
            xor^=i;
        }
        
        int a0 =0;
        
        int temp=0;
        for(int i=1;i<n;i=i+2){
            temp^=arr[i];
        }
        
        a0=temp^xor;
        ans[0]=a0;
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i-1]^arr[i-1];
        }
        return ans;
    }
}