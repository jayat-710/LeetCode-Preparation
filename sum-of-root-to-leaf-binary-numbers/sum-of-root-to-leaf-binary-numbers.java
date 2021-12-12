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
    public int sumRootToLeaf(TreeNode root) {
        if(root==null)return 0; int ans=0;
        ArrayList<String> list = new ArrayList<>();
        helper(root,"",list);
        
        for(int i=0;i<list.size();i++){
           String temp=(list.get(i));
            System.out.println(temp);
            ans+=sum(temp);
            
        }
        return ans;
    }
    
    static void helper(TreeNode root,String str,ArrayList<String> list){
        if(root==null)return;
        if(root.left==null && root.right==null)list.add(str+root.val);
        
       
            helper(root.left,str+root.val,list);
            helper(root.right,str+root.val,list);
        
    }
    
    static int sum(String binary){
        int ans=0;
        int k=0;
        for(int i=binary.length()-1;i>=0;i--){
            ans+=Math.pow(2,k)*Character.getNumericValue(binary.charAt(i));
            k++;
        }
        
        return ans;
    }
}