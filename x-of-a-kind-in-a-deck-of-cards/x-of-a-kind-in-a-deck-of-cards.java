class Solution {
    public boolean hasGroupsSizeX(int[] arr) {
      
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
          int k= map.getOrDefault(arr[i],0);
            map.put(arr[i],k+1);
        }
        
//         int x =map.get(arr[0]);
        
//         if(x<2){
//             return false;
//         }
        int min =Integer.MAX_VALUE;
        for(int i : map.keySet()){
            int temp = map.get(i);
            
            if(temp<2){
                return false;
            }
            
            min = Math.min(min,temp);
           
        }
        // System.out.println(min);
        int gcd = map.get(arr[0]);
        for(int i : map.keySet()){
            int x = map.get(i);
            
           gcd = gcd(gcd,x);
            
            // min = Math.min(min,temp);
           
        }
        
        if(gcd>1){
            return true;
        }
        
        return false;
        
    }
    static int gcd(int x, int y) {
        return x == 0 ? y : gcd(y%x, x);
    }
}