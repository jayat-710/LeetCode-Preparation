class Solution {
    public int[] plusOne(int[] digits) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int inhand=1;
        
        for(int i=digits.length-1;i>=0;i--){
            // if(i==digits.length-1)digits[i]+=1;
            if(digits[i]+inhand<=9){
                
                list.add(digits[i]+inhand);
                inhand=0;
            }
            else{
            list.add((digits[i]+inhand)%10);
            inhand=1;
            }
        }
        if(inhand>0)list.add(inhand);
        
        int arr[]= new int[list.size()];
        int k=0;
        for(int i=list.size()-1;i>=0;i--){
            arr[k]=list.get(i);k++;
        }
        return arr;
        
    }
}