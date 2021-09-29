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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        else return helper(root);
    }
    
    static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        
     return Math.max(height(root.left),height(root.right))+1;
    }
    
    static boolean helper(TreeNode root){
        if(root==null){
            return true;
        }
        
        // helper(root.left);
        // helper(root.right);
        int lheight =height(root.left);
        int rheight = height(root.right);

        if(Math.abs(lheight-rheight)<=1 && helper(root.left)==true && helper(root.right)==true){
            return true;
        }
        
//         helper(root.left);
//          helper(root.right);
        
        
        return false;
        
        
    }
}