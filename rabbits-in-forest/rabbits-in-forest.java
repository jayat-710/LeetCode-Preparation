class Solution {
    public int numRabbits(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        int ans=0;
        for(int i=0;i<n;i++){
            
            if(!map.containsKey(arr[i])){
                map.put(arr[i],0);
            }
            
          if(map.get(arr[i])==0){
            ans+=arr[i]+1;  
          }  
            map.put(arr[i],map.get(arr[i])+1);
            
            if(map.get(arr[i])==arr[i]+1){
                map.put(arr[i],0);
            }
        }
        
        return ans;
    }
}