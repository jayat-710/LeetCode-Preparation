class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        
        ArrayList<Integer> list = new ArrayList<>(); 
        
        HashSet <Integer> set = new HashSet<>();
        
        for(int i=1;i<=bound;i*=x){
            for(int j=1;i+j<=bound;j*=y){
               set.add(i+j);
                
                if(y==1)
                    break;
            }
            if(x==1)
                break;
        }
        
        for(int i:set){
            list.add(i);
        }
        
        return list;
    }
}