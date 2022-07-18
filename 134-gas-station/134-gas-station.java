class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int diff[]= new int[gas.length];
        
        for(int i=0;i<gas.length;i++){
            diff[i]=gas[i]-cost[i];
        }
        
        int start=0 ; int sum=0;
        for(int i=0;i<gas.length;i++){
            sum+=diff[i];
            // start=i;
            if(sum<0){
                sum=0;
                start=i+1;
            }
        }
        
        sum=0;
        for(int i=0;i<diff.length;i++){
            sum+=diff[i];
        }
        
        if(sum<0)return -1;
        
        return start;
       
        
        
    }
}