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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        Queue<TreeNode> q =  new LinkedList<>();
        q.add(root);
        int count=0;
        int max=Integer.MIN_VALUE;
        int ans=1;
        while(!q.isEmpty()){
            int k=q.size();
            int sum=0;
            for(int i=0;i<k;i++){
            TreeNode temp = q.poll();
            sum+=temp.val;
            if(temp.right!=null)
            q.add(temp.right);
            if(temp.left!=null)
            q.add(temp.left);
            }
            count++;
            if(sum>max){
               max=sum;
               ans=count;
            }
        }
        
        return ans;
    }
}