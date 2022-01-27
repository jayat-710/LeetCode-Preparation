class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        
        for(int i=0;i<knowledge.size();i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                i++;String temp="";
                while(s.charAt(i)!=')'){
                    temp+=s.charAt(i);
                    i++;
                }
                
                if(map.containsKey(temp))ans+=map.get(temp);
                else ans+="?";
            }
            else{
                ans+=String.valueOf(s.charAt(i));
            }
            
            
        }
        
        return ans;
    }
}