class Solution {
    public int minimumOperations(int[] nums, int start, int goal) {
        
        
        Queue<Integer> q = new LinkedList<>();
        HashSet <Integer> set = new HashSet<>();
        
        q.add(start); int count=0;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=1;i<=size;i++){
                int temp=q.poll(); 
                if(temp==goal){
                    return count;
                }
                
                if(temp>1000 || temp<0)
                    continue;
               
                
                if(set.contains(temp))
                    continue;
                
                set.add(temp);
               
                for(int j=0;j<nums.length;j++){
                int op1 =(temp + nums[j]);
                int op2 =(temp - nums[j]);
                 int op3 =(temp ^ nums[j]);
                    
                    q.add(op1);
                    q.add(op2);
                    q.add(op3);
                
                }
            }
            
            count++;
        }
        
        return -1;
        
    }
}