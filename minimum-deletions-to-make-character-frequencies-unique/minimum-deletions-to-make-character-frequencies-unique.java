class Solution {
    public int minDeletions(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        int arr[]= new int[map.size()];
        int sum=0;
        int j=0;
       for(char i:map.keySet()){
           arr[j]=map.get(i);
           sum+=arr[j];
           j++;
       }
        int arr1[]= new int[arr.length];
        
        // System.out.println(sum);
        
       Arrays.sort(arr);
        int k=0;
        for(int i=arr.length-1;i>=0;i--){
            arr1[k]=arr[i];
            k++;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int ans=0;
        
        for(int i=0;i<arr1.length;i++){
            
            if(list.contains(arr1[i])){
            while(list.contains(arr1[i]) && arr1[i]>=0){
                arr1[i]-=1;
                
                if(arr1[i]==0){
                    break;
                }
            }
            }
            // System.out.println(arr1[i]);
            list.add(arr1[i]);
            ans+=arr1[i];
        }
        
        
        
        return sum-ans;
        
    }
}