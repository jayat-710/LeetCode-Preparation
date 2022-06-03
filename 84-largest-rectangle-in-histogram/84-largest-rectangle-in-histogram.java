class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        //smallest to my right
        int ansL[]= new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(stk.isEmpty()){
                ansL[i]=n-1;
            }
            else{
                while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                    stk.pop();
                }
                if(stk.isEmpty()){
                    ansL[i]=n-1;
                    
                }
                else
                ansL[i]=stk.peek()-1;
            }
            
            stk.push(i);
        }
        // for(int i:ansL){
        //     System.out.print(i+" ");
        // }
        // System.out.println(" ");
        //smallest to my left
        int ansR[]= new int[n];
        Stack<Integer> stk1 = new Stack<>();
        for(int i=0;i<n;i++){
            if(stk1.isEmpty()){
                ansR[i]=0;
            }
            else{
                while(!stk1.isEmpty() && arr[stk1.peek()]>=arr[i]){
                    stk1.pop();
                }
                if(stk1.isEmpty()){
                    ansR[i]=0;
                    
                }
                else
                ansR[i]=stk1.peek()+1;
            }
            
            stk1.push(i);
        }
//          for(int i:ansR){
//             System.out.print(i+" ");
//         }
        
        int ans[]= new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(ansL[i]-ansR[i])+1;
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,ans[i]*arr[i]);
        }
        return max;
    }
}