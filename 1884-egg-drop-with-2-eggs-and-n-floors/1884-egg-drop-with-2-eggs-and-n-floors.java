class Solution {
    public int twoEggDrop(int n) {
        // ArraysList<Integer> list= new ArrayList<>();
        int sum=n; int count=0;
        while(sum>0){
            sum-=count;
            // list.add(sum);
            count++;
        }
        
         return count-1; 
    }
}