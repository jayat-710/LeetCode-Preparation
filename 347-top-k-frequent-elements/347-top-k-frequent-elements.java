class Solution {
    class Pair{
        int first;
        int sec;
        
        Pair(int first,int sec){
            this.first=first;
            this.sec=sec;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((Pair o,Pair p)-> p.sec-o.sec);
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for(int i:map.keySet()){
          pq.add(new Pair(i,map.get(i)));  
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        while(k-->0){
            list.add(pq.poll().first);
        }
        
        int arr[]= new int[list.size()];
        int j=0;
        
        for(int i:list){
            arr[j]=i;
            j++;
        }
        
        return arr;
    }
}