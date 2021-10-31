class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r = binarySearchRow(matrix,target);
        if(r==-1)
            return false;
        
        
        // System.out.println(r);
        return binarysearch(matrix,r,target);
        
    }
    static boolean binarysearch(int matrix[][],int r,int target){
        int low=0; int high= matrix[0].length-1;
         while(low<=high){
            
            int mid=(low+high)/2;
            if(matrix[r][mid]==target){
                return true;
            }
            else if(matrix[r][mid]<target){
                
                low=mid+1;
            }
            else{
                
                high=mid-1;
            }
        }
        
        return false;
        
    }
    
    
    static int binarySearchRow(int matrix[][],int target){
        int low=0; int high= matrix.length-1;
        
        int ans=0;
        
        while(low<=high){
            
            int mid=(low+high)/2;
            if(matrix[mid][0]<=target && target<= matrix[mid][matrix[0].length-1]){
                return mid;
            }
            else if(matrix[mid][0]<target){
                
                low=mid+1;
            }
            else{
                // ans=mid;
                high=mid-1;
            }
        }
        
        return -1;
    }
    
}