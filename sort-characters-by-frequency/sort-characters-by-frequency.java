class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b)->(b.y-a.y));
        
        for(int i=0;i<s.length();i++){
            char x =s.charAt(i);
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        for(char c:map.keySet()){
            pq.add(new pair(c,map.get(c)));
        }
        
        String str="";
        
        while(!pq.isEmpty()){
            pair temp=pq.poll();
            char c =temp.x;
            int k=temp.y;
            
            while(k-->0){
                str+=c;
            }
        }
        
        return str;
        
    }
    class pair{
        char x;
        int y;
        
        pair(char x,int y){
            this.x=x;
            this.y=y;
        }
    }
}