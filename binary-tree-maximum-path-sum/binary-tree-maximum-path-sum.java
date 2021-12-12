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
    static int result = Integer.MIN_VALUE; 
    // static int dp[]= new int[100000];
    public int maxPathSum(TreeNode root) {
        result=Integer.MIN_VALUE;
       // Arrays.fill(dp,-1);
        helper(root);
        return result;
    }
    
    static int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        
        
        
//        int ms =      Math.max((Math.max(helper(root.left),helper(root.right))+root.val),root.val);
//         int m2l =  Math.max((helper(root.left)+helper(root.right)+root.val),ms);
        
        int left=Math.max(0,helper(root.left));
        int right=Math.max(0,helper(root.right));
        
        result=Math.max(result,left+right+root.val);
        return Math.max(left,right)+root.val;
        
       
        
        // return ms;
        
    }
}