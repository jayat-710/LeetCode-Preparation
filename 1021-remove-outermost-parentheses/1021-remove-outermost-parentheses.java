class Solution {
    public String removeOuterParentheses(String s) {
        ArrayList<String> list = new ArrayList<>();
        
        Stack<Character> stk = new Stack<>();
        String temp="";
        
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                
                temp+=s.charAt(i);
                stk.add('(');
                
            }
            else{
                temp+=')';
                stk.pop();
                
                if(stk.size()==0){
                    list.add(temp.substring(1,temp.length()-1));
                    temp="";
                }
            }
        }
        String ans="";
        for(String str : list){
            ans+=str;
        }
        
        return ans;
    }
}