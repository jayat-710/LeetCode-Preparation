class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        int arr[] = new int[n];
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        
         for(int i=0;i<n;i++){
             //prerequisites[i][0]
            map.put(i,new ArrayList<>());
        }
        
        for(int i=0;i<prerequisites.length;i++){   
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        // int nvis[]= new int[n];
       
        
         int nvis[] = new int[n]; 
        int dfsvis[] = new int[n];  Arrays.fill(nvis,0);Arrays.fill(dfsvis,0);
        
        for(int i = 0;i<n;i++) {
            if(nvis[i] == 0) {
                if(isCycle(i, map, nvis, dfsvis) == true) return new int[0]; 
            }
        }
        
        int vis[] = new int[n];
        Arrays.fill(vis,0);
        
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0;i<n;i++){
           if(vis[i]==0){
               vis[i]=1;
               topo(i,map,stk,vis);
           } 
        }
        
        
        
        int k=0;
        while(!stk.isEmpty()){
            arr[k]=stk.peek();
            stk.pop();
            k++;
        }
        return arr;
    }
    
    static void topo(int x, HashMap<Integer,ArrayList<Integer>> map,Stack<Integer> stk,int vis[]){
        
        
        for(int i:map.get(x)){
            if(vis[i]!=1){
                vis[i]=1;
                topo(i,map,stk,vis);
            }
        }
        
        
        stk.push(x);
        
        
    }
    static boolean isCycle(int x, HashMap<Integer,ArrayList<Integer>> map,int nvis[] ,int dfsvis[]){
        
        nvis[x]=1;
        dfsvis[x]=1;
        
        
        for(int i:map.get(x)){
            if(nvis[i]!=1){

              if  (isCycle(i,map,nvis,dfsvis)==true) return true;
            }
            else {
                if(dfsvis[i]==1) return true;
            }
        }
        
        
       dfsvis[x]=0;
        return false;
        
        
    }
}