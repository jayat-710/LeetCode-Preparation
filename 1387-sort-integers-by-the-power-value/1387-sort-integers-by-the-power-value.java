class Solution {
    class Pair{
        int power;
        int ith_integer;
        
        Pair(int power,int ith_integer){
            this.power=power;
            this.ith_integer=ith_integer;
        }
    }
    static HashMap<Integer,Integer> map;
    public int getKth(int lo, int hi, int k) {
        map = new HashMap<>();
        ArrayList<Pair> list= new ArrayList<>();
        for(int i=lo;i<=hi;i++){
            int pow=helper(i);
            list.add(new Pair(pow,i));
        }
        Collections.sort(list,(a,b)->((a.power-b.power==0)?a.ith_integer-b.ith_integer:a.power-b.power));
        return list.get(k-1).ith_integer;
    }
    
    static int helper(int n){
        
        if(n==1)return 0;
        if(map.containsKey(n))return map.get(n);
        int first=0;int sec=0;
        if(n%2==0)
            map.put(n,helper(n/2)+1);
            
        
        else  map.put(n,helper(3*n+1)+1);
        
        return map.get(n);
    }
}