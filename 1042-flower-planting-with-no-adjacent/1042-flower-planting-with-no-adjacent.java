class Solution {
    HashMap<Integer,ArrayList<Integer>> map;
    int col[];
    public int[] gardenNoAdj(int n, int[][] paths) {
        int m=4;
        map= new HashMap<>();
        col= new int[n];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i=0;i<n;i++)map.put(i,new ArrayList<>());
        
        for(int i=0;i<paths.length;i++){
            map.get(paths[i][0]-1).add(paths[i][1]-1);
            map.get(paths[i][1]-1).add(paths[i][0]-1);
        }
        helper(0,m,n);
        
        return col;
        
    }
    
    public boolean isValid(int node,int colour,int n){
        for(int i:map.get(node)){
            if(col[i]==colour)return false;
        }
        
        return true;
    }
    
    public boolean helper(int node,int colour,int n){
        if(node==n)return true;
        
        for(int i=1;i<=colour;i++){
            if(isValid(node,i,n)){
                col[node]=i;
                if(helper(node+1,colour,n))return true;
                
                col[node]=0;
            }
            
            
        }
        
        return false;
    }
}