class RandomizedSet {
 HashMap<Integer,Integer> map;
    ArrayList<Integer> list;
    Random random;
    public RandomizedSet() {
        map=new HashMap<>();
        list =  new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        list.add(val);
        map.put(val,list.size()-1);
        
        return true;
    }
    
    public boolean remove(int val) {
       if(!map.containsKey(val)){
            return false;
        }
        
        int temp =map.get(val);
        ///
         map.remove(val);
        ///
        if(temp==list.size()-1){
            list.remove(temp);
            return true;
        }
        
        int x =list.get(list.size()-1);
         list.set(temp,x);
       list.remove(list.size()-1);
        map.put(list.get(temp),temp);
        
        return true;
        
    }
    
    public int getRandom() {
        int randomidx = random.nextInt(list.size());
        return list.get(randomidx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */