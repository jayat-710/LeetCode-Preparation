class Solution {
    public int findCircleNum(int[][] isConnected) {
        if(isConnected==null || isConnected.length==0){
            return 0;
        }
        int n=isConnected.length;
        
        unionFind un= new unionFind(n);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    un.union(i,j);
                }
            }
        }
        
       return un.getCount();
        
    }
    class unionFind{
        private int rank[];
        private int parent[];
        private int count;
        
        unionFind(int n){
            rank= new int[n];
            parent= new int[n];
            count=n;
            
            for(int i=0;i<n;i++){
                rank[i]=0;
                parent[i]=i;
            }
        }
        
        
        int findPar(int node){
            if(node==parent[node])return node;
            
            return parent[node]=findPar(parent[node]);
            
        }
        
        
        void union(int u,int v){
            u=findPar(u);
            v=findPar(v);
            
            if(parent[u]!=parent[v]){
            if(rank[u]>rank[v]){
                parent[v]=u;
            }
            
            else if(rank[v]>rank[u]){
                parent[u]=v;
            }
            else{
                parent[v]=u;
                rank[u]+=1;
            }
            
            count--;
            }
            
        }
        
         int getCount(){
            return count;
        }
    }
}