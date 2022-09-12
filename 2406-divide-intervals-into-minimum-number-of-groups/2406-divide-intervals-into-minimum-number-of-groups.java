class Solution {
    public int minGroups(int[][] intervals) {
        int arr1[]= new int[intervals.length];
        int arr2[]= new int[intervals.length];
        
        for(int i=0;i<intervals.length;i++){
            arr1[i]=intervals[i][0];
            arr2[i]=intervals[i][1];
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i=0;
        int j=0;
        
        int count=0;
        int ans =Integer.MIN_VALUE;
        while(i<intervals.length && j<intervals.length){
            if(arr1[i]<=arr2[j]){
                i++;
                count++;
            }
            else{
                count--;
                j++;
                    
            }
            
            ans=Math.max(ans,count);
        }
        
        // if(j>i)System.out.println(ans);
        
        return ans;
    }
}