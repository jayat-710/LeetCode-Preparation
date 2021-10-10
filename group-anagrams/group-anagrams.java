class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map= new HashMap<>();
        List<List<String>> ans;
        
        
        for(String str:strs){
           char[] chararray = str.toCharArray(); 
           
            
            Arrays.sort(chararray);
            String key = String.valueOf(chararray);
            
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            
            map.get(key).add(str);
            
        }
        
        return new ArrayList(map.values());
        
        
    }
}