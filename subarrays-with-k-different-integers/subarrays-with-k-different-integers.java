class Solution {
    public int subarraysWithKDistinct(int[] arr, int k) {
        return atmostKdistinct(arr,k) -atmostKdistinct(arr,k-1);
    }
    
    static int atmostKdistinct(int arr[],int k){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=-1;
        int j=-1;
        int count=0;
        while(true){
            while(i<arr.length-1){
                i++;
                
                
                int temp= arr[i];
                map.put(temp,map.getOrDefault(temp,0)+1);
                
                if(map.size()<=k){
                    count+=i-j;
                }
                else{
                    break;
                }
            }
            
            if(i==arr.length-1 && map.size()<=k){
                break;
            }
            
            while(j<i){
                j++;
                int temp=arr[j];
                int x =map.get(arr[j]);
                
                if(x==1){
                    map.remove(arr[j]);
                }
                else{
                    map.put(arr[j],x-1);
                }
                
                if(map.size()<=k){
                    count+=i-j;
                    break;
                }
                else continue;
            }
            
        }
        
        return count;
    }
}