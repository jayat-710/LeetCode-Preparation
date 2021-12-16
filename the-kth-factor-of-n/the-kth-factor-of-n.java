class Solution {
    public int kthFactor(int n, int k) {
        HashSet<Integer> set = new HashSet<>();
        
        if(n==1 && k==1)return 1;
        
//         if(k>=n)return -1;
        
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
            {set.add(i);
            set.add(n/i);}
        }
        
        int arr[]= new int[set.size()];
        int j=0;
        for(int i:set){
            arr[j]=i;
            j++;
        }
        
        
        Arrays.sort(arr);
        
        if(k-1>=arr.length)return -1;
        
        return arr[k-1];
    }
}