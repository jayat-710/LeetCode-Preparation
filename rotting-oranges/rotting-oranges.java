class Solution {
    static class cordinates{
        int x;
        int y;
        
        cordinates(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
     static int distX[]={1,0,0,-1};
    static int distY[]={0,1,-1,0};
    
    public int orangesRotting(int[][] grid) {
         int row= grid.length;
        int col=grid[0].length;
        
        Queue<cordinates> q =new ArrayDeque<>();
        boolean arr[][]= new boolean[row][col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                
                if(grid[i][j]==2){
                    q.offer(new cordinates(i,j));
                    arr[i][j]=true;
                    
                }
            }
        }
        boolean zero=false;
        if(q.isEmpty()){
            
             for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
         
                if(grid[i][j]==1)
                    return -1;
                
                if(grid[i][j]==0)
                    zero=true;
                
            }
        }
        }
        
        if(zero==true)
            return 0;
        
        
        int max=-1;
        
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            
                while(!q.isEmpty()){
                max++;
                
                int size=q.size();
                
                while(size-->0){
                    cordinates temp=q.poll();
                    
                    for(int k=0;k<4;k++){
                            int x =temp.x+distX[k];
                            int y= temp.y+distY[k];
                            
                            if(x>=0 && y>=0 && x<grid.length && y < grid[0].length && grid[x][y]==1 && arr[x][y]==false){
                            arr[x][y]=true;
                            grid[x][y]=0;
                            q.offer(new cordinates(x,y));
                        }
                    }
                        
                }
                
            }
         }
         }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
         
                if(grid[i][j]==1)
                    return -1;
                
                
                
            }
        }
        
        return max;
    }
}
