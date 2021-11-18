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
    public int sumNumbers(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root==null) return 0;
        
        helper(root,"",list);
        int sum=0;
        for(String str : list){
            sum+= Integer.parseInt(str);
        }
            
        return sum;
    }
    
    static List<String> helper(TreeNode root,String str,List<String> list){
        if(root.left==null && root.right==null){
            list.add(str+root.val);
        }
        
        if(root.left!=null)helper(root.left,str+root.val,list);
        if(root.right!=null)helper(root.right,str+root.val,list);
        
        return list;
    }
}