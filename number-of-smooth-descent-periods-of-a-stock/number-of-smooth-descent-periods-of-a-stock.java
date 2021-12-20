class Solution {
    public long getDescentPeriods(int[] prices) {
        long counter=0;long sum=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]==prices[i-1]-1){
                counter++;
            }
            else{
                if(counter>0){
                sum+=sumN(counter);
                // System.out.println(sumN(counter));
                }
                counter=0;
            }
             // System.out.println(sum);
        }
        if(counter>0){
             sum+=sumN(counter);
        }
        //45+1+6+16
        
        return sum+prices.length;
    }
    static long sumN(long n){
        return n*(n+1)/2;
    }
}