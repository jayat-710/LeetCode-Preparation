class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            int ans=Integer.MIN_VALUE;
            for(int i : map.keySet()){
                int temp=map.get(i);
                if(i==temp)ans=Math.max(ans,i);
            }
        
        
        return (ans<0)?-1:ans;
    }
}