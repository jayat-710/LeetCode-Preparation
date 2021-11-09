class Solution {
    
    class Degree{
        int in;
        int out;
        
        Degree(int in,int out){
            this.in =in;
            this.out=out;
        }
    }
    
    public int findJudge(int n, int[][] arr) {
        int m =arr.length;
        
        if(arr.length==0 && n==1){
            return 1;
        }
       
        HashMap<Integer,Degree> map = new HashMap<>();
        
        for(int i=0;i<m;i++){
            
            //if absent
            if(!map.containsKey(arr[i][0]))
            map.put(arr[i][0],new Degree(0,1));
            
            else{
                Degree a = map.get(arr[i][0]);
                int temp1=a.out;
                int temp2=a.in;
                map.put(arr[i][0],new Degree(temp2,temp1+1));
            }
            
             if(!map.containsKey(arr[i][1]))
            map.put(arr[i][1],new Degree(1,0));
            
            else{
                Degree a = map.get(arr[i][1]);
                int temp1=a.out;
                int temp2=a.in;
                map.put(arr[i][1],new Degree(temp2+1,temp1));
            }
            
            
        }
        
        for(int i : map.keySet()){
            Degree ans = map.get(i);
            // System.out.println(i+"->"+ans.in +" "+ans.out+"...>>");
            if(ans.in==n-1 && ans.out==0){
                return i;
            }
        }
        
        return -1;
        
        
    }
}