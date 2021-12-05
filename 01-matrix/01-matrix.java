class Solution {
    class pair{
        int i;
        int j;
        
        pair(int x,int y){
            i=x;
            j=y;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        
        Queue <pair> q = new LinkedList<>();
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.add(new pair(i,j));
                }
                else{
                    mat[i][j]=-1;
                }
            }
        }
        
        while(!q.isEmpty()){
            pair temp = q.poll();
            
            int x =temp.i;
            int y=temp.j;
            
            if( x+1>=0 && y>=0 && x+1<mat.length && y<mat[0].length && mat[x+1][y]<0)
            {
                q.add(new pair(x+1,y));
                mat[x+1][y]=mat[x][y]+1;
            }
           if( x-1>=0 && y>=0 && x-1<mat.length && y<mat[0].length && mat[x-1][y]<0)
            {
                q.add(new pair(x-1,y));
                mat[x-1][y]=mat[x][y]+1;
            }
             if( x>=0 && y+1>=0 && x<mat.length && y+1<mat[0].length && mat[x][y+1]<0)
            {
                q.add(new pair(x,y+1));
                mat[x][y+1]=mat[x][y]+1;
            }
             if( x>=0 && y-1>=0 && x<mat.length && y-1<mat[0].length && mat[x][y-1]<0)
            {
                q.add(new pair(x,y-1));
                mat[x][y-1]=mat[x][y]+1;
            }
            
            
            
        }
        
        return mat;
        
    }
}