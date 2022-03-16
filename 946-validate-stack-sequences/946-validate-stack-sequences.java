class Solution {
    public boolean validateStackSequences(int[] arr1, int[] arr2) {
        
        Stack<Integer> stk1 =  new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        
        for(int i=arr2.length-1; i>=0;i--){
            stk2.push(arr2[i]);
            // System.out.println(stk2.peek());
        }
        int j=0;
        
            for(int i=0;i<arr1.length;i++){
               
                stk1.push(arr1[i]);
                // if(arr1[i]==stk2.peek()){
                while(!stk1.isEmpty() && stk1.peek()==arr2[j] && j<arr2.length){
                    stk1.pop();
                    j++;
                // }
                    
            }
                 
    }
        
        if(stk1.isEmpty()){
            return true;
        }
        
       
        
        return false;
    }
}