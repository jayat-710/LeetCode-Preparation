class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        
        HashMap<Integer,Integer> map= new HashMap<>();
        int ans=0;
        
        for(List<Integer> list: wall){
            int sum=0;
            for(int j=0;j<list.size()-1;j++){
                
                sum+=list.get(j);
                
                map.put(sum,map.getOrDefault(sum,0)+1);
                int temp= map.get(sum);
              ans= Math.max(ans,temp);
            }
        }
        
//         for(int k : map.keySet()){
            
//             if(k==wall.size())
//                 continue;
//             int temp= map.get(k);
//             ans= Math.max(ans,temp);
//         }
//         System.out.println(ans);
        return wall.size()-ans;
    }
}