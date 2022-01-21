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
    TreeNode prev=null;TreeNode first=null;TreeNode sec=null; 
    public void recoverTree(TreeNode root) {
        
        if(root==null)return ;
        
         helper(root);
        int temp= first.val;
        first.val=sec.val;
        sec.val=temp;
        
    }
    
    void helper(TreeNode curr){
        
    if(curr==null)return;
        
        helper(curr.left);
        if(prev!=null){
        if(first==null && prev.val>curr.val){
            first=prev;
        }}
        if(first!=null && prev.val>curr.val)sec=curr;
        
        prev=curr;
        
        helper(curr.right);
        
        
        
        
    }
}