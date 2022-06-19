class Solution {
    class Pair{
        int a;
        int b;
        
        Pair(int a, int b){
            this.a=a;
            this.b=b;
        }
    }
    public int[] mostCompetitive(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((Pair first,Pair sec)->(first.a==sec.a)?first.b-sec.b:first.a-sec.a);
        int n=nums.length; int size=k;
        ArrayList<Integer> list = new ArrayList<>();
        // 0--->n-k   1 2 3 4 5 6 7 8 9  n=9 k=4
        
        int i;
        for(i=0;i<=n-k;i++){
            pq.add(new Pair(nums[i],i));
        }
        // System.out.println(i);
        while(!pq.isEmpty() && i<n){
            Pair temp = pq.poll();
            
            list.add(temp.a);
            // System.out.println(list.get(list.size()-1));
            k--;
            if(i<=n-k){
                
                pq.add(new Pair(nums[i],i));
            }
            // System.out.println(pq.peek().b +" "+temp.b);
            while(!pq.isEmpty() && ((pq.peek().a<temp.a && pq.peek().b<temp.b) ||
                                   (pq.peek().b<temp.b))){
                // System.out.println(pq.peek().a);
                pq.poll();
            }
            i++;
        }
        
        list.add(pq.poll().a);
        int ans[]= new int[size];
        
        for(int j=0;j<size;j++){
            ans[j]=list.get(j);
        }
        
        return ans;
    }
}