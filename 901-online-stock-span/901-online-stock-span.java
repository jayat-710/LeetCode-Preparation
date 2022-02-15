class StockSpanner {
    ArrayList<Integer> list;
    Stack<Integer> stk;
    public StockSpanner() {
        list= new ArrayList<>();
        stk = new Stack<>();
    }
    
    public int next(int price) {
        int idx=list.size();
        
        while(!stk.isEmpty() && list.get(stk.peek())<=price){
            stk.pop();
        }
        
        int ans =0;
        if(stk.size()==0){
            ans=idx+1;
        }
        else{
            ans=idx-stk.peek();
        }
        
        stk.push(idx);
        list.add(price);
        
        return ans;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */