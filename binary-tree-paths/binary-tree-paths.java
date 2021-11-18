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
    public List<String> binaryTreePaths(TreeNode root) {
    
        List<String> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        return helper(root,list,"");
    } 
    
    static List<String> helper(TreeNode root,List<String> list,String str){
        
        if(root.left==null && root.right==null){
            // str+=root.val;
            list.add(str+root.val);
        }
        
        if(root.left!=null){
            // str+=root.val;
            // str+="->";
            helper(root.left,list,str+root.val+"->");
        }
        
         if(root.right!=null){
            // str+=root.val;
            // str+="->";
            helper(root.right,list,str+root.val+"->");
        }
        
       return list;

    }
}