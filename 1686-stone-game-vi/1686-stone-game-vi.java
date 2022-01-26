class Solution {
    class Pair{
        int first;
        int sec;
        
        Pair(int first,int sec){
            this.first=first;
            this.sec=sec;
        }
    }
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->((b.first+b.sec)-(a.first+a.sec)));
        
        for(int i=0;i<aliceValues.length;i++){
            pq.add(new Pair(aliceValues[i],bobValues[i]));
        }
        int alice=0;int bob=0;int t=1;
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            if(t%2!=0)
            alice+=curr.first;
            else bob+=curr.sec;
            
            t++;
        }
        
        if(alice==bob)return 0;
        
        return (alice>bob)?1:-1;
        
    }
}