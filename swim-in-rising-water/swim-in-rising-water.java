class Solution {
    class pair{
        int i;
        int j;
        int msf;
        
        pair(int i,int j,int msf){
            this.i=i;
            this.j=j;
            this.msf=msf;
        }
    }
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        
        PriorityQueue<pair> pq = new PriorityQueue<>((x,y) -> x.msf-y.msf);
        
        pq.add(new pair(0,0,grid[0][0]));
        boolean vis[][]= new boolean[n][n];
        
        // vis[0][0]=true;
        
        while(!pq.isEmpty()){
            pair rem = pq.poll();
            // System.out.println(rem.msf);
            
            if(rem.i==n-1 && rem.j==n-1) return rem.msf;
            
            if(vis[rem.i][rem.j]==true)continue;
            
            vis[rem.i][rem.j]=true;
              // System.out.println("vvvvv");
            if(rem.i+1<n && vis[rem.i+1][rem.j]==false){
              
                pq.add(new pair(rem.i+1,rem.j,Math.max(rem.msf,grid[rem.i+1][rem.j])));
            }
            if(rem.i-1>=0 && vis[rem.i-1][rem.j]==false){
                pq.add(new pair(rem.i-1,rem.j,Math.max(rem.msf,grid[rem.i-1][rem.j])));
            }
            if(rem.j+1<n && vis[rem.i][rem.j+1]==false){
                pq.add(new pair(rem.i,rem.j+1,Math.max(rem.msf,grid[rem.i][rem.j+1])));
            }
            if(rem.j-1>=0 && vis[rem.i][rem.j-1]==false){
                pq.add(new pair(rem.i,rem.j-1,Math.max(rem.msf,grid[rem.i][rem.j-1])));
            }
        }
        
        return 0;
    }
    
    
}