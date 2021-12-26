class Solution {
    public int maximumSwap(int num) {
        String temp= Integer.toString(num);
        char arr[]= temp.toCharArray();
        char str[]=temp.toCharArray();
        Arrays.sort(arr);
        int target=-1;
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=str[j]){
                target=arr[i];
                break;
            }
            j++;
        }
        
        if(j>=temp.length())return num;
        
        for(int i=temp.length()-1;i>=j;i--){
            if(str[i]==target){
                char k=str[i];
                str[i]=str[j];
                str[j]=k;
                
                break;
            }
        }
        String ans="";
        for(int i=0;i<str.length;i++){
            ans+=str[i];
        }
        
        return Integer.parseInt(ans);
    }
}