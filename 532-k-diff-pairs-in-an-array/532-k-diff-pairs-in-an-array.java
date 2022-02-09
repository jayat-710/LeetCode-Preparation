class Solution {
    public class pair{
    int a;
    int b;
    pair(int p,int q){
        a=p;
        b=q;
    }
    public boolean equals(Object o) {
        if (o instanceof pair) {
            pair p = (pair)o;
            return p.a == a && p.b == b;
        }
        return false;
    }
    public int hashCode() {
        return new Integer(a).hashCode() * 31 + new Integer(b).hashCode();
    }
}
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        
        // for(int j:nums){
        //     System.out.print(j+" ");
        // }
        
       HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<pair> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        if(k==0){
            
            for(int p : map.keySet()){
                // if(map.get(p)%2==0){
                pair temp=new pair(p,p);
                if(!set.contains(temp) && map.get(p)>1){
                    ans+=1;
                    set.add(temp);
                    }
                // }
            }
            
            return ans;
        }
        
        int count=0;pair temp;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int req= num-k;
            //1 1 3 4 5
           temp=new pair(num,req);
            if(!set.contains(temp)&& map.containsKey(req) && map.get(req)>=1){
                // System.out.println(num+" "+req);
                count+=1;
                map.put(req,map.get(req)-1);
                set.add(temp);
            }
        }
        // for(pair p:set){
        //     System.out.println(p.a+" "+p.b);
        // }
        
        return count;
    }
}