class Solution {
    class Pair{
        int idx;
        int val;
        
        Pair(int idx,int val){
            this.idx=idx;
            this.val=val;
        }
    }
    public int[] dailyTemperatures(int[] temp) {
        int nge[]= new int[temp.length];
        
        //i need a stack
        Stack<Pair> stk = new Stack<>();
        
        
        for(int i=temp.length-1;i>=0;i--){
            
            while(!stk.isEmpty() && temp[i]>=stk.peek().val){
              stk.pop();
            }
            
            nge[i]= (stk.isEmpty())?0:stk.peek().idx-i;
            stk.push(new Pair(i,temp[i]));
        }
        
        return nge;
    }
}