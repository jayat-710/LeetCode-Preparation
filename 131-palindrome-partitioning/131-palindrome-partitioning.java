class Solution {
    static List<List<String>>ans;
    public List<List<String>> partition(String s) {
       ans = new ArrayList<>();
        // List<String> list = new ArrayList<>();
        
        helper(s,new ArrayList<>());
        
        return ans;
    }
    
    static void helper(String str,List<String> list){
            if(str.length()==0){
                ans.add(new ArrayList<>(list));
                return ;
            }
        
        for(int i=0;i<str.length();i++){
            String sub=str.substring(0,i+1);
            String ros=str.substring(i+1);
            
            if(isPal(sub)){
                list.add(sub);
                helper(ros,list);
                list.remove(list.size()-1);
            }
        }
    }
    
    static boolean isPal(String str){
        int i=0;int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))return false;
            
            i++;
            j--;
        }
        return true;
            
    }
}