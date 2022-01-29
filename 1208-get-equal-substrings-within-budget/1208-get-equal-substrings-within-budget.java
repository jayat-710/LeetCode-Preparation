class Solution {
    public int equalSubstring(String s, String t, int k) {
        int cost[]= new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            cost[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        
        // 1 5 7 3 2 
        int i=0;
        int max=0;
        int sum=0;
        // for(int z=0;z<cost.length;z++){
        //     System.out.println(cost[z]);
        // }
        // Arrays.sort(cost);
        
        for(int j=0;j<cost.length;j++){
            sum+=cost[j];
            
            while(sum>k){
                sum-=cost[i];
                i++;
            }
            
            max=Math.max(j-i+1,max);
        }
        
        return max;
    }
}