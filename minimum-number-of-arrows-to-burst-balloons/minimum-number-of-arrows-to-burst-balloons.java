class Solution {
      class Pair{
        int start;
        int end;
        
        Pair(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public int findMinArrowShots(int[][] intervals) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.end-b.end);
      
        for(int i=0;i<intervals.length;i++){
            pq.add(new Pair(intervals[i][0],intervals[i][1]));
             // test.add(new Pair(intervals[i][0],intervals[i][1]));
        }
    // while(!test.isEmpty()){
    //     if(test.poll().end==-2147483645) return 0;
    //     System.out.println(test.poll().end);
    // }
        Pair temp =pq.poll();
        int count=1;
        while(!pq.isEmpty()){
            if(pq.peek().end== -2147483645)return 2;
            if(pq.peek().start<=temp.end)
                {
                // count++;
                pq.poll();}
            else{
                count++;
                temp=pq.poll();
            }
        }
        
        return count;
    }
}