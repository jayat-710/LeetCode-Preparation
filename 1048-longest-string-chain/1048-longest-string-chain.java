class Solution {
    class Pair{
        String str;
        int l;
        
        Pair(String str,int l){
            this.str=str;
            this.l=l;
        }
    }
    public int longestStrChain(String[] words) {
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.l-b.l);
        for(int i=0;i<words.length;i++){
            pq.add(new Pair(words[i],words[i].length()));
        }
        
        for(int i=0;i<words.length;i++){
            words[i]=pq.poll().str;
                
        }
        
        int arr[]= new int[words.length];
        Arrays.fill(arr,1);
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(i==j)continue;
                if(isPred(words[j],words[i])){
                    arr[i]=Math.max(arr[i],arr[j]+1);
                }
            }
        }
        
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            max=Math.max(max,i);
        }
        
        return max;
    }
    
    static boolean isPred(String str1,String str2){
        int i=0;
        int j=0;
        
        if((str2.length()-str1.length())!=1)return false;
        
        int k=1;
        
        while(k>=0 && i<str1.length() && j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;j++;
            }
            else{
                k--;
                j++;
            }
        }
        
        if(i==str1.length() && j==str2.length()-1)return true;
        if(i==str1.length() && j==str2.length())return true;
        
        return false;
    }
}