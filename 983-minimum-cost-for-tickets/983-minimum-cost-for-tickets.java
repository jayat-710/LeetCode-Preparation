class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[]= new int[400];
        Arrays.fill(dp,-1);
        boolean day[]= new boolean[366];
        Arrays.fill(day,false);
        int n=days[days.length-1];
        Arrays.sort(days);
        for(int i:days){
            day[i]=true;
        }
        
      return  rec(costs,day,days[0],n,dp);
    }
    
    static int rec(int costs[],boolean day[],int cday,int n,int dp[]){
        if(cday>n){
            return 0;
        }
        if(dp[cday]!=-1)return dp[cday];
        
        int ans =Integer.MAX_VALUE;
        
        if(day[cday]==false){
            return rec(costs,day,cday+1,n,dp);
        }
        
         ans=Math.min(rec(costs,day,cday+1,n,dp)+costs[0],rec(costs,day,cday+7,n,dp)+costs[1]);
        ans=Math.min(ans,rec(costs,day,cday+30,n,dp)+costs[2]);
        
        return dp[cday]=ans;
    }
}