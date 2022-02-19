class Solution {
    public int minimumDeviation(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->(o2-o1));
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                pq.add(arr[i]*2);
                min=Math.min(min,arr[i]*2);
            }
            else{
                pq.add(arr[i]);
                min=Math.min(min,arr[i]);
            }
            
            
        }
         int diff=Integer.MAX_VALUE;
        while(!pq.isEmpty()){
            int max=pq.poll();
            diff=Math.min(diff,max-min);
            
            if(max%2!=0)break;
           
            min=Math.min(min,max/2);
            pq.add(max/2);
            
        }
        
        return diff;
    }
}