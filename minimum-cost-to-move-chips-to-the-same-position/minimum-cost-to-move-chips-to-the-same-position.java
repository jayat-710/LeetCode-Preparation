class Solution {
    public int minCostToMoveChips(int[] position) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        for(int i=0;i<position.length;i++){
            map.put(position[i],map.getOrDefault(position[i],0)+1);
            max=Math.max(max,position[i]);
        }
        // long arr[]= new long[max+1];
//         for(int i=1;i<=max;i++){
//             if(map.containsKey(i))arr[i]=map.get(i);
            
//             else arr[i]=0;
//         }
        
        int sum_even=0,sum_odd=0;
        
        for(int i:map.keySet()){
            if(i%2==0)sum_even+=map.get(i);
            
            else sum_odd+=map.get(i);
        }
       
        
        if(sum_even>sum_odd){
            return sum_odd;
        }
        
        else
            return sum_even;
        
        
    }
}