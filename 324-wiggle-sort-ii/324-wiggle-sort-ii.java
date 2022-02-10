class Solution {
    static int count[]; 
    static int j;
    public void wiggleSort(int[] nums) {
        count= new int[5001];
        j=5000;
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        
        for(int i=1;i<nums.length;i+=2){
            nums[i]=nextValue();
        }
        
        for(int i=0;i<nums.length;i+=2){
            nums[i]=nextValue();
        }
    }
    
    static int nextValue(){
        while(count[j]==0){
            j--;
        }
        count[j]--;
        return j;
        
    }
}