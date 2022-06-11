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
    static int max=-1;
    public int longestUnivaluePath(TreeNode root) {
        max=0;
        helper(root);
        
        return max;
    }
    static int dfs(TreeNode root,int val){
        if(root==null)
            return 0;
        
        if(root.val!=val)return 0;
        
        return Math.max(dfs(root.left,val),dfs(root.right,val))+1;
    }
    
    static void helper(TreeNode root){
        if(root==null)return;
        
        int cnt=dfs(root.left,root.val)+dfs(root.right,root.val);
        max=Math.max(max,cnt);
        
        helper(root.left);
        helper(root.right);
    }
}