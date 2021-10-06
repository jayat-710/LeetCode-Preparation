class Solution {
    public int minAddToMakeValid(String str) {
       int n = str.length();
        
        Stack <Character> stk = new Stack<>();
        
        for(int i=0;i<n;i++){
           if(str.charAt(i)=='('){
               stk.push(str.charAt(i));
           } 
            else{
                if(stk.isEmpty()){
                   stk.push(str.charAt(i)); 
                }
                else{
                    if(stk.peek()=='('){
                        stk.pop();
                    }
                    else{
                        stk.push(str.charAt(i));
                    }
                }
            }
        }
        
        return stk.size();
    }
}