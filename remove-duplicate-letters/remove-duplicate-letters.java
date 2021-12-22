class Solution {
    public String removeDuplicateLetters(String str) {
        
        int n = str.length();
        
        Stack <Character> stk = new Stack<>();
        HashMap<Character,Integer> map= new HashMap<>();
        HashMap<Character,Boolean> exist = new HashMap<>();
        
        for(int i=0;i<n;i++){
            int temp=map.getOrDefault(str.charAt(i),0);
            // exist.put(str.charAt(i),false);
            map.put(str.charAt(i),temp+1);
            
        }
        
        for(int i=0;i<n;i++){
           // stk.push(str.charAt(i));
            if(!exist.containsKey(str.charAt(i)) || exist.get(str.charAt(i))==false){
            while(stk.size()>0 && stk.peek()>str.charAt(i) && map.get(stk.peek())>0){
                exist.put(stk.pop(),false);
            }
            
            stk.push(str.charAt(i));
            
             exist.put(str.charAt(i),true);
            }map.put(str.charAt(i),map.get(str.charAt(i))-1);
        }
        String rev="";
        while(!stk.isEmpty()){
            rev+=stk.peek();stk.pop();
        }
        
        String res="";
        for(int i=rev.length()-1;i>=0;i--){
            res+=rev.charAt(i);
        }
       return res; 
    }
}