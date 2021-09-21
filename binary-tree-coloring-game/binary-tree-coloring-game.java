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
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        TreeNode temp = findNode(root,x);
        int left=count(temp.left);
        int right=count(temp.right);
        
        int rem = n-left-right-1;
        
        if(left+right<rem || left+rem<right ||right+rem<left)
        return true;
        
        return false;
    }
    public int count(TreeNode node){
        if(node==null){
            return 0;
        }
        
        return count(node.left)+count(node.right)+1;
    }
    
    public TreeNode findNode(TreeNode node,int x){
        if(node==null){
            return null;
        }
        
        if(node.val==x){
            return node;
        }
        
      TreeNode left=  findNode(node.left,x);
        if(left!=null){
            return left;
        }
       return findNode(node.right,x);
        
    }
}