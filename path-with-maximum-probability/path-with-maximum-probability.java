class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end)     {
        
        HashMap<Integer,ArrayList<pair>> map = new HashMap<>();
        int ver =edges.length;
        
        for(int i=0;i<n;i++){
            
            map.put(i,new ArrayList<>());
        }
        
        for(int i=0;i<ver;i++){
            map.get(edges[i][0]).add(new pair(edges[i][1],succProb[i]));
            map.get(edges[i][1]).add(new pair(edges[i][0],succProb[i]));
        }
        
        boolean vis[] = new boolean[n];
        
        double ans[] = new double[n];
        Arrays.fill(ans,0.0);
        
        PriorityQueue<pair> pq = new PriorityQueue<>(n,new pair());
        
        pq.add(new pair(start,1.0));
        
        while(!pq.isEmpty()){
            pair temp = pq.poll();
            
            int curr = temp.des;
            double prob =temp.prb;
            
            
            if(vis[curr]==false){
                 ans[curr]=prob;
                if(curr==end){
                    return ans[curr];
                }
                
                vis[curr]=true;
               
                
            }
            
            for(pair each : map.get(curr)){
                if(vis[each.des]==false && prob*each.prb>ans[each.des]){
                    ans[each.des]=prob*each.prb;
                    pq.add(new pair(each.des,ans[each.des]));
                }
                
               
            }
        }
        
        
        return 0;
        
        
    }
    
   class pair implements Comparator<pair>{
       int des;
       double prb;
       
       pair(int des,double prb){
           this.des=des;
           this.prb=prb;
       }
       pair(){
           
       }
       public int compare(pair a,pair b){
           if(a.prb>b.prb)
               return -1;
           
           else if(b.prb>a.prb)
               return 1;
           
           else
               return 0;
       }
   }
}