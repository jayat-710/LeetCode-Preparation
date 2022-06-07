class Solution {
    static ArrayList<List<String>> ans ;
    
    public List<List<String>> partition(String s) {
        ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        solve(s,list);
        
        return ans;
    }
    
    static void solve(String s,List<String> list){
        
        if(s.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int k=0;k<s.length();k++){
            String sub =s.substring(0,k+1);
            String ros=s.substring(k+1);
            
            if(isPal(sub)){
                list.add(sub);
                solve(ros,list);
                list.remove(list.size()-1);
            }
        }
    }
    
    static boolean isPal(String str){
        int i=0; int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j))return false;
            i++;j--;
        }
        
        return true;
    }
}