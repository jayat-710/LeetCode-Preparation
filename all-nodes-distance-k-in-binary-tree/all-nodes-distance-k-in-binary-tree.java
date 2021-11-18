class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        parentmap(map,root);
        HashSet<TreeNode> set = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(target);
        while(!q.isEmpty()){
            
            int size=q.size();
            
            for(int i=0;i<size;i++){
            TreeNode temp=q.poll();
            
             set.add(temp);
                
            if(k==0){
                list.add(temp.val);
            }
            
            if(temp.left!=null && !set.contains(temp.left)){
            TreeNode left=temp.left;
            q.add(left);
            }
            if(temp.right!=null && !set.contains(temp.right)){
            TreeNode right= temp.right;
            q.add(right);
            }
            
            if(map.containsKey(temp) && !set.contains(map.get(temp))){
                q.add(map.get(temp));
            }
        }
            
            k--;
            if(k<0)break;
            
            
            
        } return list;
    }
    
   
    
    private static void parentmap(HashMap<TreeNode, TreeNode> hm, TreeNode root){
        if(root == null) return;
        if(root.left != null)
            hm.put(root.left, root);
        
        if(root.right != null)
            hm.put(root.right, root);
    
        parentmap(hm, root.left);
        parentmap(hm, root.right);
        return;
    }
    
}