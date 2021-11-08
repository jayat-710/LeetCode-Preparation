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
    public boolean isSymmetric(TreeNode root) {
        return help(root,root);
        
    }
    
    public boolean help(TreeNode p,TreeNode q){
        
        // System.out.println(p.val +" "+q.val+"-->");
        
        if(p==null && q== null)
            return true;
        
        if(p==null || q==null)
            return false;
        
       
        
       if(p.val==q.val && help(p.left,q.right) && help(p.right,q.left))
           return true;
        
//         if(p.val==q.val)
//             return true;
        
        return false;
    }
}