class Solution {
   static class pair{
         char a;
         int freq;
        
        pair(char a,int freq){
            this.a=a;
            this.freq=freq;
        }
    }
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        PriorityQueue<pair> pq = new PriorityQueue<>((m,n)->(n.freq-m.freq));
        
        for(char x : map.keySet()){
             // 
            pq.offer(new pair(x,map.get(x)));//System.out.println(pq.peek().freq);
        }
        // pq.poll();
        // while(pq.size()>0){
        //     pair tt =pq.poll();
        // System.out.println(tt.a+" "+tt.freq);
        // }
        
        // pq.offer(new pair('a',2));
        // pq.offer(new pair('b',1));
        StringBuilder ans = new StringBuilder();
        
        pair block=pq.poll();
        ans.append(block.a);
        block.freq--;
        
        // pq
        
        while(!pq.isEmpty()){
            pair temp= pq.poll();
            ans.append(temp.a);
            temp.freq--;
            
            if(block.freq>0){
                pq.add(block);
            }
            
            block=temp;
            
        }
        if(block.freq>0)
            return "";
        
        return ans.toString();
    }
}