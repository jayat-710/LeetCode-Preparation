class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        unionFind u= new unionFind(n);
        
        for(List<Integer> l:pairs){
            u.union(l.get(0),l.get(1));
        } 
        
        HashMap<Integer,PriorityQueue<Character>> map= new HashMap<>();
        for(int i=0;i<n;i++){
            int temp= u.findPar(i);
            if(!map.containsKey(temp))map.put(temp,new PriorityQueue<>());
           map.get(temp).offer(s.charAt(i));
        }
    
        
        String ans="";
        
        for(int i=0;i<n;i++ ){
            int temp=u.findPar(i);
            char c=map.get(temp).poll();
            ans+=c;
        }
        
        return ans;
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