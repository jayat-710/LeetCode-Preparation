class Solution {
   static class Pair{
        int i;
        int j;
        int l;
        
       Pair(int i,int j,int l){
            this.i=i;
            this.j=j;
            this.l=l;
        }
    }
    public int shortestBridge(int[][] grid) {
        
        ArrayDeque<Pair> q = new ArrayDeque<>();
        boolean flag=true;
        
        for(int i=0;i<grid.length && flag;i++){
            for(int j=0;j<grid[0].length && flag;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j,q);
                    flag=false;
                }
            }
        }
        
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        
        while(!q.isEmpty()){
            Pair temp = q.poll();
            
            for(int k=0;k<4;k++){
                int tempi = temp.i+dir[k][0];
                int tempj = temp.j+dir[k][1];
                
                if(tempi>=0 && tempi<=grid.length-1 && tempj>=0 && tempj<=grid[0].length-1){
                    if(grid[tempi][tempj]==0){
                        q.add(new Pair(tempi,tempj,temp.l+1));
                        grid[tempi][tempj]=2;
                    }
                    else if(grid[tempi][tempj]==1)
                        return temp.l;
                }
            }
        }
        
      return -1;  
    }
    
    static void dfs(int grid[][],int i,int j,ArrayDeque<Pair> q ){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=1){
            return;
        
        }
        
        
        grid[i][j]=2;
        q.add(new Pair(i,j,0));
        
        dfs(grid,i-1,j,q);
        dfs(grid,i+1,j,q);
        dfs(grid,i,j-1,q);
        dfs(grid,i,j+1,q);
    }
}