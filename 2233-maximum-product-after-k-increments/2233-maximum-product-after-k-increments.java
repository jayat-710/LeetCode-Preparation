class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }
        
        while(k-->0){
            int temp=pq.poll();
            pq.add(temp+1);
        }
        long res=1;
        while(!pq.isEmpty()){
            res*=pq.poll();
            res=res%1000000007;
        }
        
        return (int)res ;
    }
}