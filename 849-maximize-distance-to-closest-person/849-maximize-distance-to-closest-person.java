class Solution {
    public int maxDistToClosest(int[] seats) {
        int left[]= new int[seats.length];
        int right[]= new int[seats.length];
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){left[i]=-1;
            max=Math.max(max,i);}
            else{
                if(max==Integer.MIN_VALUE)left[i]=Integer.MAX_VALUE;
                else
                left[i]=max;
            }
        }
        
      int  min=Integer.MAX_VALUE;
        
        for(int i=seats.length-1;i>=0;i--){
            if(seats[i]==1){
                right[i]=-1;
                min=Math.min(min,i);
            }
            else{
                right[i]=min;
            }
            
        }
        max=Integer.MIN_VALUE;
        
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1)continue;
            
            seats[i]=Math.min(Math.abs(i-left[i]),Math.abs(i-right[i]));
            max=Math.max(max,seats[i]);
        }
        
        return max;
    }
}