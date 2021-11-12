class Solution {
    public int[] beautifulArray(int n) {
        
       ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        
        while(list.size()<n){
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int i:list){
                if(2*i-1<=n)
                temp.add(2*i-1);
            }
            for(int i:list){
                if(2*i<=n)
                temp.add(2*i);
            }
            
            list=temp;
        }
        int arr[]= new int[n];
        int j=0;
        for(int i:list){
            arr[j]=i;
            j++;
        }
        
        return arr;
}
}