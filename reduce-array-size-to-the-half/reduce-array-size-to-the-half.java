class Solution {
    class pair{
        int a;
        int b;
    
        pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    
    }
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
            
        }
        int n=arr.length;
        
        
        // PriorityQueue <pair> q = new PriorityQueue<>((a,b)-> (b-a));
        
        PriorityQueue<pair> pq =new PriorityQueue<>((n1,n2) -> Integer.compare(n2.b, n1.b));
        for(int k:map.keySet()){
            pq.add(new pair(k,map.get(k)));
        }
        int len=0; int count=0;
        
        while(len<n/2){
            pair temp =pq.poll();
            len+=temp.b;
            count++;
        }
        
        
         return count;
    }
}