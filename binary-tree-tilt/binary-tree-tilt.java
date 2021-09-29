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
    static int sum=0;
    public int findTilt(TreeNode root) {
       sum=0;
        
    helper(root);
        return sum;
    }
    
    public void helper(TreeNode node){
         if(node==null){
            return ;
        }
        
     helper(node.left);
    helper(node.right);
        int tilt;
       if(node.left== null && node.right== null){
           tilt=0;
       } 
        else if(node.left== null){
            tilt =Math.abs(node.right.val);
        }
         else if(node.right== null){
            tilt =Math.abs(node.left.val);
        }
        
        else{
            tilt =Math.abs(node.left.val- node.right.val);
        }
        sum+=tilt;
        
        if(node.left!=null){
            node.val+=node.left.val;
        }
        if(node.right!=null){
            node.val+=node.right.val;
        }
        
       
    }
}