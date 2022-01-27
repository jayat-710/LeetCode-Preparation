class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int j=s.length-1;
        for(int i=g.length-1;i>=0;i--){
            if(j<0)break;
            // if(g[i]>s[j])break;
            if(g[i]<=s[j]){
                count++;
                j--;
            }
        }
        
        return count;
    }
}