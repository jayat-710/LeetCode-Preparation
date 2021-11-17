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
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        return helper(root);
    }
    public int helper(TreeNode root){
         if(root==null)
            return 0;
        helper(root.left);
        helper(root.right);
        
        if(root.left!=null && root.left.left==null && root.left.right==null){
        System.out.println(root.left.val);
        sum+=root.left.val;
        System.out.println(sum);
        // return sum;
        }

        return sum;
    }
}