class Solution {
    public int maximum69Number (int num) {
        // String temp=Integer.toString(num);
        char ch[] = String.valueOf(num).toCharArray();
        for(int i=0;i<ch.length;i++){
            // if(str.charAt(i)=='6')
            if(ch[i]=='6'){ch[i]='9';break;}
        }
        String ans="";
        for(int i=0;i<ch.length;i++){
            ans+=ch[i];
        }
        
        return Integer.parseInt(ans);
    }
}