class Solution {
    public int numberOfWeakCharacters(int[][] arr) {
        int dp[]= new int[arr.length];

        
        Arrays.sort(arr,new Comparator<int[]>(){
            // @override
            public int compare(int a[],int b[]){
                if(a[0]==b[0])
                    return b[1]-a[1];
                
                return a[0]-b[0];
            }
        });
        
//          for(int j=0;j<dp.length;j++){
//                  System.out.println(arr[j][0]+" "+arr[j][1]);
//          }
        
         int count=0;
        int max=arr[dp.length-1][1];System.out.println(max);
        for(int i=dp.length-2;i>=0;i--){
            // for(int j=dp.length-1;jj++){
                if(arr[i][1]<max){
                    // System.out.println(arr[i][1]);
                    count++;
                }
                   
            // }
            
            max=Math.max(max,arr[i][1]);
            
          
        }
        
     
        
        return count;
    }
}