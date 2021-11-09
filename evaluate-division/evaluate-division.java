class Solution {
  static  class Pair{
        String a;
        double b;
        
        Pair(String a,double b){
            this.a=a;
            this.b=b;
        }
        
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        double[] arr=new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            
            String start = queries.get(i).get(0);
            String goal = queries.get(i).get(1);
            
//             if(start==goal){
//                 arr[i]=1.0;
//                 continue;
//             }
            arr[i]=helper(equations,values,start,goal);
        }
        
        return arr;
        
    }
    
    static double helper (List<List<String>> equations,double[] values,String start,String goal){
        
        
        
        Map<String, ArrayList<Pair>> map = new HashMap();
        
        for(int i=0;i<equations.size();i++){
            List<String> temp = equations.get(i);
            
            String str1=temp.get(0);
            String str2 =temp.get(1);
            
            if(!map.containsKey(str1)){
              
                    
                map.put(str1,new ArrayList());
               map.get(str1).add(new Pair(str2,values[i]));
            }
            else{
                map.get(str1).add(new Pair(str2,values[i]) );
            }
            
            if(!map.containsKey(str2)){
                map.put(str2,new ArrayList());
            }
           
                map.get(str2).add(new Pair(str1,1/values[i]) );
            
            
            
        }
        // System.out.println(start+"-"+goal+"->");
        if(start.equals(goal) ){
            if(map.containsKey(start))
            return 1;
            
            else return -1;
        }
        
        if(!map.containsKey(start) || !map.containsKey(goal))
            return -1;
        
        
        Queue<Pair> q = new LinkedList<>();
        
        // int k=1;
        q.add(new Pair(start,1.0));
        
        HashSet <String> check = new HashSet<>();
        
        check.add(start);
        
        while(!q.isEmpty()){
           Pair temp= q.poll();
            String str = temp.a;
            
             double k=temp.b;
           
            if(str.equals(goal)){
                return k;
            } 
            // if(!map.containsKey(str) || map.get(str)==null ){
            //     continue;
            // }
            
            
            // System.out.println("ccccccccccc");
            if(map.containsKey(str)){
            for(Pair p : map.get(str)){
                
                if(check.contains(p.a)){
                    continue;
                }
               q.add(new Pair(p.a,k*p.b));
                check.add(p.a);
                
            }
            }
        }
        
       return -1;
        
        
            
    }
}