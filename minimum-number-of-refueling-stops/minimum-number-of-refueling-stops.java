class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
       int nextLocation =startFuel;
        int count=0;
        int i=0;
        PriorityQueue <int []>  pq = new PriorityQueue<>((x,y) -> -1* Integer.compare(x[1],y[1]));
        
        while(nextLocation< target){
            for(;i<stations.length;i++){
                if(stations[i][0]<=nextLocation){
                    pq.add(stations[i]);
                }
                else{
                    break;
                }
            }
            // System.out.println(pq.poll());
            if(pq.isEmpty()){
                return -1;
                
            }
            
            else{
             nextLocation+=pq.poll()[1];
                
                
                count++;
                
            }
            
        }
        
        return count;
    }
}