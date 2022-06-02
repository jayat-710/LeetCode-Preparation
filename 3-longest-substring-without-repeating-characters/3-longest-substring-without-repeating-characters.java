class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        
        int max=0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<s.length()){
            if(!map.containsKey(s.charAt(j)) || map.get(s.charAt(j))==0){
                map.put(s.charAt(j),1);
            }
            else{
                while(s.charAt(i)!=s.charAt(j)){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    i++;
                }
                i++;
                
            }
            
            max=Math.max(max,j-i+1);
            j++;
        }
        
        return max;
    }
}