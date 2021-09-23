/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int camera=0;
    public int minCameraCover(TreeNode root) {
        camera=0;
        if(minCamCover_(root)==-1){
            camera++;
        }
        
        return camera;
    }
    
    static int minCamCover_(TreeNode root){
        
        //if i need a camera =-1
        //if i have a camera = 0;
        //if i m covered = 1;
        
        
        if(root==null){
            return 1;
        }
        
        int lc = minCamCover_(root.left);
         int rc = minCamCover_(root.right);
        
        //if my one of the child need a camera
        
        if(lc == -1 || rc ==-1){
            camera++;
            return 0;
        }
        if(lc==0 || rc == 0){
            return 1;
        }
        
        
        return -1;
    }
}