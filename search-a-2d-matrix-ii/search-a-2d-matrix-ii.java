class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length;
        int n = matrix[0].length;
        
        int r=0;
        int c=n-1;
        
        while(r<m && c>=0){ 
            // System.out.print(r+" "+c+"     ");
            if(matrix[r][c]==target)
                return true;
            
            else if(matrix[r][c]<target)
                r++;
            
            else
                c--;
            
            
           
        }
        
        return false;
        
    }
}