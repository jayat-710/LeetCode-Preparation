class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int ith[]= new int[grid.length];
        int jth[]= new int[grid.length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                ith[i]=Math.max(ith[i],grid[i][j]);
                jth[j]=Math.max(jth[j],grid[i][j]);
            }
        }
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                sum+=Math.min(ith[i],jth[j])-grid[i][j];
            }
        }
        
        return sum;
    }
}