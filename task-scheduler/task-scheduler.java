class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        
        for(char x : map.keySet()){
            pq.add(map.get(x));
        }
        
        int max =pq.poll();
        
        int total = (max-1)*n;
        
        while(!pq.isEmpty()){
            total-= Math.min(max-1,pq.poll());
        }
        if(total<0){
            total=0;
        }
        
        return tasks.length+total;
    }
}