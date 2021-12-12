class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n =k;
     PriorityQueue<pair> pq = new PriorityQueue<>((x,y)->y.sec-x.sec);
    PriorityQueue<pair> ans = new PriorityQueue<>((x,y)->x.first-y.first);
        
    for(int i=0;i<nums.length;i++){
        pq.add(new pair(i,nums[i]));
    }
        
        while(k-->0){
            pair temp=pq.poll();
            ans.add(temp);
        }
        
        int arr[]=new int[n];
        int i=0;
        while(!ans.isEmpty()){
            arr[i]=ans.poll().sec;
            i++;
        }
        
        return arr;
    }
    class pair{
        int first;
        int sec;
        
        pair(int a,int b){
            first=a;
            sec=b;
        }
    }
}