class Solution {
    public boolean isValid(String str) {
        Stack <Character> stk = new Stack<>();
        
        int n = str.length();
        
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='(' ||str.charAt(i)=='{' ||str.charAt(i)=='[' ){
                stk.push(str.charAt(i));
            }
            
            else{
                if(str.charAt(i)==')'){
                    
                    if(stk.isEmpty()){
                        return false;
                    }
                    if(stk.peek()=='('){
                        stk.pop();
                    }
                    else{
                        return false;
                    }
                }
              else  if(str.charAt(i)=='}'){
                    
                    if(stk.isEmpty()){
                        return false;
                    }
                    if(stk.peek()=='{'){
                        stk.pop();
                    }
                    else{
                        return false;
                    }
                }
             else   if(str.charAt(i)==']'){
                    
                    if(stk.isEmpty()){
                        return false;
                    }
                    if(stk.peek()=='['){
                        stk.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            
           
        }
        
        if(!stk.isEmpty()){
            return false;
        }
        return true;
    }
}