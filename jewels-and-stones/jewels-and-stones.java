class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        int k=jewels.length();
        int z= stones.length();
        for(int i=0;i<z;i++){
            boolean bool =false;
            for(int j=0;j<k;j++){
                if(stones.charAt(i)==jewels.charAt(j))
                    bool=true;
            }
            if(bool)
                count++;
        }
        return count;
    }
}