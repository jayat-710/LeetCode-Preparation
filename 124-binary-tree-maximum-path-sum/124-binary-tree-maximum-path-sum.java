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
    static int res;
    public int maxPathSum(TreeNode root) {
        res= Integer.MIN_VALUE;
        helper(root);
        
        return res;
    }
    
    static int helper(TreeNode root){
        if(root==null)
            return 0;
        
        int left = Math.max(0,helper(root.left));
        int right= Math.max(0,helper(root.right));
    
        res= Math.max(root.val+left+right,res);
        
        return Math.max(left,right)+root.val;
        
    }
}