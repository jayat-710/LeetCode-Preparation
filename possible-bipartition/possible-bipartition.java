class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        if(n==1)return true;
        HashMap<Integer,ArrayList<Integer>>map= new HashMap<>();
        
        for(int i=1;i<=n;i++){
            map.put(i,new ArrayList<>());
            
        }
        int arr[] = new int[n+1]; Arrays.fill(arr,0);
        
        for(int i=0;i<dislikes.length;i++){
            map.get(dislikes[i][0]).add(dislikes[i][1]);
            map.get(dislikes[i][1]).add(dislikes[i][0]);
        }
        boolean vis[]= new boolean[n+1];
        
        for(int i=0;i<dislikes.length;i++){
            if(arr[dislikes[i][0]]==1 || arr[dislikes[i][0]]==-1)continue;
        Queue<Integer> q = new LinkedList<>();
        q.add(dislikes[i][0]);arr[dislikes[i][0]]=1;
        
        while(!q.isEmpty()){
            int curr=q.poll();
            int wt=arr[curr];
            if(vis[curr]==true)continue;
            // for(int i:map.keySet()){
                ArrayList<Integer> list= map.get(curr);
                vis[curr]=true;
                for(int j=0;j<list.size();j++){
                    if(arr[list.get(j)]!=0){
                        if(arr[list.get(j)]!=-1*wt)return false;
                    }
                    
                    arr[list.get(j)]=-1*wt;
                    q.add(list.get(j));
                    
                }
            // }
        }
        }
        
        
        return true;
    }
    
    
}