class Solution {
    public long minimumRemoval(int[] beans) {
        if(beans.length==1)return 0;
        Arrays.sort(beans);
        
        boolean bool =true;
        for(int i=1;i<beans.length;i++){
            if(beans[i]!=beans[i-1])bool=false;
        }
        if(bool==true)return 0;
        
        long prfx[]= new long[beans.length];
        long sufx[]= new long[beans.length];
        
        for(int i=0;i<beans.length;i++){
            if(i==0)prfx[i]=beans[i];
            else
            prfx[i]=beans[i]+prfx[i-1];
        }
        
        for(int i=beans.length-1;i>=0;i--){
            if(i==beans.length-1)sufx[i]=beans[i];
            else
            sufx[i]=beans[i]+sufx[i+1];
        }
        
        long min=prfx[beans.length-2];
        // System.out.println(min);
        
        for(int i=sufx.length-2;i>0;i--){
            min=Math.min(min,(sufx[i+1]-beans[i]*(long)(beans.length-1-i))+prfx[i-1]);
        }
        
        min=Math.min(min,(sufx[1]-beans[0]*(long)(beans.length-1)));
        
        
        return min;
    }
}