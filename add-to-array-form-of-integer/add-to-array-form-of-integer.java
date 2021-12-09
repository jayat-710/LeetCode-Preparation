class Solution {
    public List<Integer> addToArrayForm(int[] digits, int k) {
      ArrayList<Integer> list = new ArrayList<>();
        int inhand=0;
        
        for(int i=digits.length-1;i>=0;i--){
            if(i==digits.length-1)digits[i]+=k;
            if(digits[i]+inhand<=9){
                
                list.add(digits[i]+inhand);
                inhand=0;
            }
            else{
            list.add((digits[i]+inhand)%10);
            inhand=(digits[i]+inhand)/10;
            }
        }
        // if(inhand>0)
            while(inhand>0){
            list.add(inhand%10);
                inhand=inhand/10;
            }
        
        ArrayList<Integer> ans = new ArrayList<>();
        // int arr[]= new int[list.size()];
        // int p=0;
        for(int i=list.size()-1;i>=0;i--){
            ans.add(list.get(i));
        }
        
        
        return ans;
           
    }
}