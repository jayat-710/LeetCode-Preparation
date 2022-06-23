class Solution {
    class Pair{
        int first;
        int sec;
        
        public Pair(int first,int sec){
            this.first=first;
            this.sec=sec;
        }
    }
    public int eraseOverlapIntervals(int[][] arr) {
       PriorityQueue<Pair> pq = new PriorityQueue<>((Pair o,Pair p)->(o.sec==p.sec)?(o.first-p.first):(o.sec-p.sec)); 
        
        
        for(int i=0;i<arr.length;i++){
           pq.add(new Pair(arr[i][0],arr[i][1]));
        }
        
        Pair temp=pq.poll();
        int count=0;
        
        while(!pq.isEmpty()){
            if(pq.peek().first>=temp.sec){
                temp=pq.poll();
            }
            else{
                pq.poll();
                count++;
            }
        }
        // System.out.println(count)/;
        
        return count;
    }
}