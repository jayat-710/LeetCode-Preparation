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
    
    static ArrayList<Integer> list;
    public TreeNode balanceBST(TreeNode root) {
        list=new ArrayList<>();
        helper(root);
        
      return  makeTree(0,list.size()-1);
        
        
    }
    static void helper(TreeNode root){
        if(root==null){
            return;
        }
        
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
    
    static TreeNode makeTree(int low,int high){
        
        if(low>high)return null;
        // if(low == high){
        //     TreeNode temp=new TreeNode(list.get(low));
        //     return temp;}
        if(low==high)return new TreeNode(list.get(low));
        int mid=(low+high)/2;
        TreeNode root= new TreeNode(list.get(mid));
        
        
       root.left= makeTree(low,mid-1);
        root.right=makeTree(mid+1,high);
        
        return root;
        
    }
}