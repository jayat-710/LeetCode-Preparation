class Solution {
    public int maximumUnits(int[][] boxTypes, int size) {
        
        Arrays.sort(boxTypes, (x,y) -> y[1] - x[1] );
        int ans=0;
        for(int i=0;i<boxTypes.length;i++){
           int count=Math.min(size,boxTypes[i][0]);
            
            ans+=count*boxTypes[i][1];
            size-=count;
            
            if(size==0)return ans;
        }
        
        return ans;
    }
}