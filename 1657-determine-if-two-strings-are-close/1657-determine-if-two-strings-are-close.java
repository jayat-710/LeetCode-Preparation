class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length()!=word2.length())return false;
        
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(int i=0;i<word1.length();i++){
           
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
            
        }
        
        int arr1[]= new int[map1.size()];
        int arr2[]= new int[map2.size()];
        
        int j=0;
        
        for(char x :map1.keySet()){
            
            if(!map2.containsKey(x)) return false;
            
            arr1[j]=map1.get(x);
            arr2[j]=map2.get(x);
            j++;
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int k=0;k<arr1.length;k++){
            if(arr1[k]!=arr2[k])return false;
        }
        
        
        return true;
    }
}