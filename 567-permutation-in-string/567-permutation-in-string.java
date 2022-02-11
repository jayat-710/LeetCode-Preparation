class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // s2+=" ";
        // s1=sortString(s1);
        int i=0,j=0;
        int k=s1.length();

String ans=""; 
       for( j=0;j<s2.length();j++){
           ans+=s2.charAt(j);
            
           if(ans.length()>k){
               i++;
               ans=ans.substring(1);
               // System.out.println(i+" "+j+ans.length());
            
           }
           
          if(ans.length()==k){ 
          if(check(ans,s1))return true;}
              
              // if(s1.equals(sortString(ans)))return true;
       }
                 
         return false;        
      
    }
                 
    static boolean check(String ans,String s1){
        // System.out.println(ans+" "+s1);
        HashMap<Character,Integer> map1 = new HashMap<>();
         HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(int i=0;i<ans.length();i++)
        {
            map1.put(ans.charAt(i),map1.getOrDefault(ans.charAt(i),0)+1);
        }   
        
         for(int i=0;i<s1.length();i++)
        {
            map2.put(s1.charAt(i),map2.getOrDefault(s1.charAt(i),0)+1);
        }   
        
            for(char ch : map1.keySet()){
                if(map2.containsKey(ch)){
                    int freq = map2.get(ch);
                    if(freq==map1.get(ch)){
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        return true;
    }
      public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }
}