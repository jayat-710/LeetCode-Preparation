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
    public int pathSum(TreeNode root, int targetSum) {
        count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(0,1);
        
        solve(root,map,targetSum,0);
        
        return count;
    }
    
    static void solve(TreeNode root, HashMap<Integer,Integer> map,int target ,int sum){
        if(root==null){
            return;
        }
        
        sum+=root.val;
        if(map.containsKey(sum-target)){
            count+=map.get(sum-target);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
        
        solve(root.left,map,target,sum);
        solve (root.right,map,target,sum);
        
        map.put(sum,map.get(sum)-1);
        return;
    }
}