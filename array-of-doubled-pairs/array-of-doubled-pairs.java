class Solution {
    public boolean canReorderDoubled(int[] arr) {
          int n = arr.length;
        // for(int i=0;i<n;i++){
        //     if(arr[i]<0){
        //         arr[i]=arr[i]*-1;
        //     }
        // }
        
        Arrays.sort(arr);
        int p=0;int q=0;
        for(int i=0;i<n;i++){
           if(arr[i]<0){
               q=i;
           } 
        }
        while(p<=q){
            int temp=arr[q];
            arr[q]=arr[p];
            arr[p]=temp;
            
            p++;q--;
        }
      
        
        HashMap<Integer,Integer> map =  new HashMap<>();
        for(int i=0;i<n;i++){
            int temp= map.getOrDefault(arr[i],0);
            map.put(arr[i],temp+1);
        }
        
        for(int i=0;i<n;i++){
            
            if(map.get(arr[i])==0){
                continue;
            }
            
            if(map.containsKey(2*arr[i])){
                int temp=map.get(2*arr[i]);
                
                map.put(arr[i],map.get(arr[i])-1);
                    map.put(2*arr[i],temp-1);
            
            }
        }
        // System.out.println(map.get(1));
        for(int i : map.keySet()){
            if(map.get(i)!=0){
                return false;
            }
        }
        
        return true;
    }
}