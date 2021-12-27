class Solution {
    public int numTeams(int[] rating) {
       
        int inc[]= new int[rating.length];
        int dec[]= new int[rating.length];
        
        int count=0;
        
        for(int i=0;i<rating.length;i++){
            for(int j=i;j>=0;j--){
                if(rating[i]>rating[j]){
                    inc[i]+=1;
                    count+=inc[j];
                }
            }
        }
            
             for(int i=0;i<rating.length;i++){
            for(int j=i;j>=0;j--){
                if(rating[i]<rating[j]){
                    dec[i]+=1;
                    count+=dec[j];
                }
            }
        }
            
            return count;
        
    }
}
