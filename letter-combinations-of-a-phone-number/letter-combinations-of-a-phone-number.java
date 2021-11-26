class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans= new ArrayList<>();
        String str="";
        
        if(digits.length()==0){
            return ans;
        }
        
        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        
        int i=0;
        Backtrack(map,digits,i,ans,str);
        
        return ans;
    }
    
    static void Backtrack( HashMap<Character,String> map ,String digits,int i,List<String> ans,String str){
        if(i==digits.length()){
            ans.add(str);
            return;
        }
        
        String temp=map.get(digits.charAt(i)); 
        
        for(int k=0;k<temp.length();k++){
            str+=temp.charAt(k);
            
            Backtrack(map,digits,i+1,ans,str);
            // str.replace(str.charAt(str.length()-1),"");
            str= str.substring(0,str.length()-1);
        }
    }
}