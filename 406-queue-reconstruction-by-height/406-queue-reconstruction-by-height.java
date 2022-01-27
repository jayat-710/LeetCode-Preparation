class Solution {
    public int[][] reconstructQueue(int[][] arr) {
        Arrays.sort(arr,(a,b)->(a[0]==b[0])?a[1]-b[1]:b[0]-a[0]);
        
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            list.add(arr[i][1],new int[]{arr[i][0],arr[i][1]});
            
        }
        
        return list.toArray(new int[0][0]);
    }
}