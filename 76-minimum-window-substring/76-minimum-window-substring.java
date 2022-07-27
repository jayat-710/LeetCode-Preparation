class Solution {
    public String minWindow(String s, String t) {
      HashMap<Character,Integer> map1 = new HashMap<>();
      HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(int i=0;i<t.length();i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        
        int i=0;
        int j=0;
        
        int count=0;
        int min=Integer.MAX_VALUE; int start=-1;int end=-1;
        while(j<s.length()){
            if(map2.containsKey(s.charAt(j))){
                map1.put(s.charAt(j),map1.getOrDefault(s.charAt(j),0)+1);
               if(map1.getOrDefault(s.charAt(j),0)<=map2.get(s.charAt(j))){
                  count++; 
                }
            }
            
            while(count==t.length()){
                char left=s.charAt(i);
                if(map2.containsKey(s.charAt(i))){
                map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)-1);
                    
                    if(map1.getOrDefault(s.charAt(i),0)<map2.get(s.charAt(i))){
                  count--; 
                }
            }   
                
                if(j-i<min){
                min=j-i;
                start=i;
                end=j;
            }
            
               i++; 
            }
            
           
            j++;
        }
        
        if(start==-1)return "";
        String str="";
        for(int k=start;k<=end;k++){
            str+=s.charAt(k);
        }
        
        return (start==-1)?"":str;
        
    }
}