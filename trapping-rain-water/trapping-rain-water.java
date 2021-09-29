class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        if(n<=2){
            return 0;
        }
        
        int sum=0;
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=n-1;i>=1;i--){
            right.add(arr[i]);
        }
        
        left.add(arr[0]);
        
        for(int i=1;i<n-1;i++){
            right.remove(arr[i]);
            
            int maxL = left.peek();
            int maxR = right.peek();
           int temp= Math.min(maxL,maxR)-arr[i];
           if(temp>0)
               sum+=temp;
            
            left.add(arr[i]);
        }
        return sum;
    }
}