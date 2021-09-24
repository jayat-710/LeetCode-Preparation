class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer, HashSet<Integer>>map = new HashMap<>();
        int n = stones.length;
        for(int i=0;i<n;i++){
            map.put(stones[i],new HashSet<>());
            
        }
        
        map.get(stones[0]).add(1);
        
        
        for(int i=0;i<n;i++){
            int currstone = stones[i];
            
            HashSet <Integer> set = map.get(currstone);
            
            for(int k:set){
                int temp = currstone+k;
                
                if(temp== stones[n-1]){
                    return true;
                }
                
                
                if(map.containsKey(temp)==true){
                    
                if(k-1>0){
                map.get(temp).add(k-1);
                }
                map.get(temp).add(k);
                map.get(temp).add(k+1);
                
            }
                
            }
          
            
            
        }
          
            // if(!map.get(stones[n-1]).isEmpty()){
            //     return true;
            // }
        
        return false;
    }
}