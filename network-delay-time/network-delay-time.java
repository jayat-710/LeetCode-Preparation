class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,ArrayList<Pair>> map = new HashMap<>();
        
        for(int i=1;i<=n;i++){
            map.put(i,new ArrayList<>());
        }
        
        for(int i=0;i<times.length;i++){
            map.get(times[i][0]).add(new Pair(times[i][1],times[i][2]));
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2)->p1.wt-p2.wt);
        
        pq.add(new Pair(k,0));
        
        boolean vis[] = new boolean[n+1];
        int ans[]= new int[n+1];
       
        Arrays.fill(ans,Integer.MAX_VALUE);
         ans[k]=0;
        while(!pq.isEmpty()){
        Pair temp=pq.poll();
        int curr =temp.des; //1
        int cost = temp.wt; //0
            
            if(vis[curr]==true){
                continue;
            }
            
            vis[curr]=true;
            
            for(Pair each : map.get(curr)){
                int dest=each.des; //2
                int co =each.wt;   //1
                
                if(vis[dest]==false && ans[curr]+co< ans[dest]){
                    ans[dest]=ans[curr]+co;
                    pq.add(new Pair(dest,ans[dest]));
                }
            }
            
            
        }
        int my_ans=-2;
        for(int i=1;i<=n;i++){
            if(ans[i]==Integer.MAX_VALUE)
                return -1;
            
            else{
                my_ans =Math.max(my_ans,ans[i]);
            }
        }
        
        return my_ans;
        
    }
    class Pair {
        
        int des;
        int wt;
        
        Pair(int des,int wt){
            this.des=des;
            this.wt=wt;
        }
        
        // public int compare(Pair a,Pair b){
        //     if(b.)
        // }
    }
}