class Solution {
    public int numSplits(String s) {
        int left[]= new int[s.length()];
        int right[]= new int[s.length()];
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
            left[i]=set.size();
        }
          set.clear();
        for(int i=s.length()-1;i>=0;i--){
            set.add(s.charAt(i));
            right[i]=set.size();
        }
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(left[i]==right[i+1])count++;
        }
        
        return count;
      
        
        
    }
}