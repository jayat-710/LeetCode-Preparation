class Pair{
    int first;
    int sec;
    
    Pair(int first,int sec){
        this.first=first;
        this.sec=sec;
    }
}
class Solution {
    public int findLongestChain(int[][] pairs) {
      PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->(a.sec-b.sec));  
        
        for(int i=0;i<pairs.length;i++){
           pq.add(new Pair(pairs[i][0],pairs[i][1]));
        }
        
        int count=1;
          Pair temp= pq.poll();
        while(!pq.isEmpty()){
          if(temp.sec<pq.peek().first){
              temp=pq.poll();
              count++;
        }
        else{
            pq.poll();
        }
        }
        
        
        return count;
    }
}