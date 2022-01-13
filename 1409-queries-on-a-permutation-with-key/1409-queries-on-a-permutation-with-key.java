class Solution {
    public int[] processQueries(int[] queries, int m) {
        Deque<Integer> dq = new ArrayDeque<>();
        
       
        
        for(int i=1;i<=m;i++){
            dq.add(i);
        }
        
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<queries.length;i++){
             Iterator<Integer> it = dq.iterator();
            int count=0;
             while (it.hasNext()) {
                 // System.out.println("cc");
                 if(it.next()==queries[i]){
                     ans.add(count);
                     break;
                 }
                 
                 count++;
             }
            
            dq.remove(queries[i]);
            
            
           dq.addFirst(queries[i]);
        }
        
        int res[]= new int[ans.size()];
        int j=0;
        while(j<ans.size()){
            res[j]=ans.get(j);
            j++;
        }
        
        return res;
    }
}