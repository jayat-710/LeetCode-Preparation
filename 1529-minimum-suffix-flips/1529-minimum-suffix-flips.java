class Solution {
    public int minFlips(String target) {
        
        Stack<Character> stk= new Stack<>();
        
        for(int i=target.length()-1;i>=0;i--){
            stk.push(target.charAt(i));
        }
        int count;
        char temp=stk.pop();
        if(temp=='1')count=1;
        else count=0;
        
        while(!stk.isEmpty()){
            if(stk.peek()==temp){
                stk.pop();
            }
            
            else{
                temp=stk.pop();
                count++;
            }
        }
        
        return count;
        
    }
}