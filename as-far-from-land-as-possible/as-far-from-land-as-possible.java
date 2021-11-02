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
    
    public int maxDistance(int[][] grid) {
            
        int row= grid.length;
        int col=grid[0].length;
        
        Queue<cordinates> q =new ArrayDeque<>();
        boolean arr[][]= new boolean[row][col];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                
                if(grid[i][j]==1){
                    q.offer(new cordinates(i,j));
                    arr[i][j]=true;
                }
            }
        }
        int max=-1;
       for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
            
                while(!q.isEmpty()){
                    max++;
                
                    int size =q.size();
                    
                    while(size-->0){
                         cordinates temp=q.poll();
                        
                        for(int k=0;k<4;k++){
                            int x =temp.x+distX[k];
                            int y= temp.y+distY[k];
                            
                            if(x<0 || y<0 || x>=grid.length || y >= grid[0].length || arr[x][y]==true){
                                continue;
                            }
                            
                            else{
                                arr[x][y]=true;
                                 q.offer(new cordinates(x,y));
                            }
                        }
                    }
                   
                }
                
              
            }
       }
        
          return max<=0?-1:max;
                
        
        
    }
    
  
}