class Solution {
    public int maxArea(int[] arr) {
        int i=0;
        int j=arr.length-1; int res=Integer.MIN_VALUE;
        
        while(i<=j){
            int sum =Math.min(arr[i],arr[j])*(j-i);
            
            res=Math.max(res,sum);
            
            if(arr[j]>arr[i])
                i++;
            
            else j--;
        }
        return res;
    }
}