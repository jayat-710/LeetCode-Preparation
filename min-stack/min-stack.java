class MinStack {
    Stack <Integer> stk;
    PriorityQueue<Integer> pq;
    public MinStack() {
       this.stk = new Stack<>();
        this.pq= new PriorityQueue<>();
    }
    
    public void push(int val) {
        stk.push(val);
        pq.add(val);
    }
    
    public void pop() {
       
        
        pq.remove(stk.peek());
         stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */