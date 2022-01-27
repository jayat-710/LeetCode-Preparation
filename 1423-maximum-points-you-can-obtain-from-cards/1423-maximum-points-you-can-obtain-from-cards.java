class Solution {
    public int maxScore(int[] arr, int k) {
        int prfx[]= new int[arr.length];
        int sufx[]= new int[arr.length];
        prfx[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prfx[i]=prfx[i-1]+arr[i];
        }
        sufx[arr.length-1]=arr[arr.length-1];
         for(int i=arr.length-2;i>=0;i--){
            sufx[i]=sufx[i+1]+arr[i];
        }
        
        int i=k-1;
        int j=arr.length;
        
        int max=prfx[i];
        while(i>=0 && i<j){
            
            i--;
            j--;
            if(i==-1){
            
                max=Math.max(max,sufx[j]);
                break;
            }
            max=Math.max(prfx[i]+sufx[j],max);
        }
        
        return max;
    }
}