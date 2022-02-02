class Solution {
    public int totalFruit(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int i=0;int max=Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
            
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            
            while(map.size()>2){
                
                int curr = map.get(arr[i]);
                if(curr==1){
                    map.remove(arr[i]);
                }
                else
                map.put(arr[i],curr-1);
                i++;
            }
            int count=0;
            for(int k:map.keySet()){
                count+=map.get(k);
            }
            max=Math.max(max,count);
        }
        
        
        return max;
        
    }
}