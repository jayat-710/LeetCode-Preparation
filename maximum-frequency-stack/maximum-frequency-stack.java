class FreqStack {
    HashMap<Integer,Integer> map;
    PriorityQueue <Triple> pq ;
    int order;
    
    
    public FreqStack() {
        this.map = new HashMap<>();
        this.pq = new PriorityQueue<>();
        this.order=0;
    }
    
    public void push(int val) {
        map.put(val,map.getOrDefault(val,0)+1);
        Triple temp= new Triple(val,map.get(val),++order);
        pq.add(temp);
    }
    
    public int pop() {
        Triple temp =pq.poll();
        map.put(temp.val,map.get(temp.val)-1);
        return temp.val;
        
        
    }
    
    
}
class Triple implements Comparable<Triple>{
        Integer val;
        Integer freq;
        Integer order;
        
        Triple(Integer val,Integer freq,Integer order){
            this.val= val;
            this.freq= freq;
            this.order = order;
        }
    
    
    public int compareTo(Triple o){
        int freqComapre = o.freq.compareTo(this.freq);
        if(freqComapre==0){
            return o.order.compareTo(this.order);
        }
        
        return freqComapre;
    }
        
    }

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */