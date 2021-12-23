class Solution {
    class Pair{
        int start;
        int end;
        
        Pair(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.end-b.end);
        for(int i=0;i<intervals.length;i++){
            pq.add(new Pair(intervals[i][0],intervals[i][1]));
        }
        Pair temp =pq.poll();
        int count=0;
        while(!pq.isEmpty()){
            if(pq.peek().start<temp.end)
                {count++;
                pq.poll();}
            else{
                temp=pq.poll();
            }
        }
        
        return count;
    }
}