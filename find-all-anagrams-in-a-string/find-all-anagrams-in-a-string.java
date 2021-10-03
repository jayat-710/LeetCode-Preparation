class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        
        
        HashMap<Character,Integer> p_map = new HashMap<>();
        HashMap<Character,Integer> c_map = new HashMap<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(s.length()<p.length()){
            return list;
        }
        
        for(int i=0;i<p.length();i++){
            int temp=p_map.getOrDefault(p.charAt(i),0);
            p_map.put(p.charAt(i),temp+1);
        }
        int i;
        
        for(i=0;i<p.length();i++){
            int temp=c_map.getOrDefault(s.charAt(i),0);
            c_map.put(s.charAt(i),temp+1);
        }
        
        i=p.length();
        if(check(p_map,c_map)==true){
            list.add(0);
        }
       // System.out.println(p_map.get('c') + " "+ c_map.get('c'));
        while(i<s.length()){
            
            int temp1=c_map.getOrDefault(s.charAt(i),0);
            c_map.put(s.charAt(i),temp1+1);
            
            
          int temp= c_map.get(s.charAt(i-p.length()));
            if(temp==1){
                c_map.remove(s.charAt(i-p.length()));
            }
            else
            c_map.put(s.charAt(i-p.length()),temp-1);
            
          
            
            if(check(p_map,c_map)==true){
            list.add(i-p.length()+1);
        } 
            
      i++;  }
        
        return list;
    }
    
    static boolean check(HashMap<Character,Integer> p_map,HashMap<Character,Integer> c_map){
        for(char i: c_map.keySet()){
            if(p_map.containsKey(i)){
                int temp1= p_map.get(i);
                int temp2=c_map.get(i);
                
                if(temp1!=temp2){
                    return false;
                }
            }
            else{
                return false;
            }
            
        }
        
        return true;
    }
}