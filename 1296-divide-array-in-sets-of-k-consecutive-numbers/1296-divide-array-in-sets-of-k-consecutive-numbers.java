class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length %k!=0)return false;
        Arrays.sort(nums);
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(int i:map.keySet()){
            if(map.get(i)==0)continue;
            while(map.get(i)>0){
            int temp=i;
            int count=0;
            while(count!=k){
                
                if(!map.containsKey(temp) || map.get(temp)==0)return false;
                
                    map.put(temp,map.get(temp)-1);
                temp++;
                count++;
            }
                
            // System.out.println(count);
        }
        }
        
        return true;
    }
}