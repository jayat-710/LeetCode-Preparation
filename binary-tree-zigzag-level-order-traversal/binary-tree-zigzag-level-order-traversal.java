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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        List<List<Integer>> ans = new ArrayList<>(); 
        
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root); int bool=-1;
        while(!q.isEmpty()){
         int k=q.size();   
            
          List<Integer> temp= new ArrayList<>();
            for(int i=1;i<=k;i++){
                TreeNode tempNode=q.poll();
                temp.add(tempNode.val);
                if(tempNode.left!=null){
                q.add(tempNode.left);
                }
                if(tempNode.right!=null)
                q.add(tempNode.right);
            }
            List<Integer> chotaAns = new ArrayList<>();
            if(bool==1){
                for(int i=temp.size()-1;i>=0;i--){
                    chotaAns.add(temp.get(i));
                }
                
            }
            else{
                for(int i:temp){
                    chotaAns.add(i);
                }
            }
            bool=bool*-1;
          
            ans.add(chotaAns);
        }
        
        return ans;
    }
}