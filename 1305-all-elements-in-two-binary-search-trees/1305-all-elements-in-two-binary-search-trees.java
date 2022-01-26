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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1= helper(root1,list1);
        list2= helper(root2,list2);
        
            List<Integer> ans = new ArrayList<>();
        
        // int size = Math.min(list1.size(),list2.size());
        if(list1==null){
            Collections.sort(list2);
            return list2;
        }
        if(list2==null){
            Collections.sort(list1);
            return list1;
        }
        int j=0;int k=0;
        while(j<=list1.size()-1 && k<=list2.size()-1){
            if(list1.get(j)<=list2.get(k)){
                ans.add(list1.get(j));
                j++;
            }
            else{
                 ans.add(list2.get(k));
                k++;
            }
        }
         while(j<=list1.size()-1){
             ans.add(list1.get(j));j++;
         }
        
         while(k<=list2.size()-1){
             ans.add(list2.get(k));k++;
         }
        
        return ans;
    }
    
    static List<Integer> helper(TreeNode root,List<Integer>list){
        
        if(root==null)return null;
        
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
        
        return list;
    }
}