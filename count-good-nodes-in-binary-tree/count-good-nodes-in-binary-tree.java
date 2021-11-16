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
    static int count=0;
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        count=0;
        return countNode(root,Integer.MIN_VALUE);
    }
    static int countNode(TreeNode root,int min){
        if(root==null){
            return 0;
        }
        if(root.val>=min){
            min=root.val;
            count++;
        }
        countNode(root.left,min);
        countNode(root.right,min);
        
        
        return count;
    }
}