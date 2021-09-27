class Solution {
    public int longestConsecutive(int[] arr) {
        int n= arr.length;
        
        HashSet<Integer> set =  new HashSet<>();
        
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int max = 0; int count=0;
        for(int i : arr){
           
            if(set.contains(i-1)){
                continue;
            }
            else{
                count=1;
                while(set.contains(i+1)){
                count++; 
                    i+=1;
                }
                
                max=Math.max(max,count);
                
            }
        }
        
        return max;
    }
}