class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Queue<String> minHeap = new PriorityQueue<>((s1, s2) ->{
            return compare(s1, s2);
        });
        
        for(String num: nums){
            minHeap.add(num);
            if(minHeap.size() > k)
                minHeap.poll();
        }
        return minHeap.poll();
    }
    
    private int compare(String num1, String num2){
        if(num1.length() < num2.length())
            return -1;
        else if(num1.length() > num2.length())
            return 1;
        for(int i = 0; i < num1.length(); i++){
            if(num1.charAt(i) < num2.charAt(i))
                return -1;
            else if(num2.charAt(i) < num1.charAt(i))
                return 1;
        }
        //same number
        return 0;
    }
}