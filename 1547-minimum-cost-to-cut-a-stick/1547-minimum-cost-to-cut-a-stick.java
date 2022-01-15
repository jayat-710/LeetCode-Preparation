class Solution {
    // static int dp[][]= new int[10001][10001];
   static Map<ArrayList<Integer> ,Integer>  map;
    public int minCost(int n, int[] cuts) {
        map= new HashMap<>();
        
        return helper(cuts,0,n);
    }
    
    static int helper(int cuts[],int li,int ri){
        
        ArrayList<Integer> Ind= new ArrayList<>();
        Ind.add(li);
        Ind.add(ri);
        
        if(map.containsKey(Ind))return map.get(Ind);
            
       int res=Integer.MAX_VALUE;
        
      
        for(int i:cuts){
            if(i<=li ||i>=ri)continue;
            int left=helper(cuts,li,i);
            int right=helper(cuts,i,ri);
            
            res=Math.min(res,left+right+ri-li);
            // System.out.println(ri-li);
        }
        if(res==Integer.MAX_VALUE)res=0;
        map.put(Ind,res);
        return res;
    }
}