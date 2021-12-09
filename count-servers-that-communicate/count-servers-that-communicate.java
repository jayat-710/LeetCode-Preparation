class Solution {
    static int count=0;
    public int countServers(int[][] grid) {
        boolean vis[][]=new boolean[grid.length][grid[0].length];
        count=0;
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                 count=0;
                if(grid[i][j]==1){
                    // System.out.println("i"->i+" "+"j"->j);
                    helper(i,j,grid);
                    if(count==1)count=0;
                    sum+=count;
                }
            }
        }
        
        return sum;
        
    }
    
    
    static void helper(int i,int j,int grid[][]){
        if(i>=grid.length || j>=grid[0].length)return ;
        
        if(grid[i][j]==1)
            count++;
        
        grid[i][j]=0;
       
        for(int k=0;k<grid.length;k++){
          if(grid[k][j]==1)  
         helper(k,j,grid);
       
        }
        for(int m=0;m<grid[0].length;m++){
            if(grid[i][m]==1)
            helper(i,m,grid);
        }
        
       
    }
}