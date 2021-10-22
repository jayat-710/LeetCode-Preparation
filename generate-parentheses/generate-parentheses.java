class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n,n,"",ans);
        
        return ans;
        
    }
    static void helper(int l,int r,String str, List<String> ans){
        if(l==0 && r==0){
            ans.add(str);
            return ;
        }
        
        if(l>=0 && r>=0 && r>l){
            helper(l-1,r,str+"(",ans);
            helper(l,r-1,str+")",ans);
            
        }
        
        if(l>=0 && r>=0 && r<=l){
            helper(l-1,r,str+"(",ans);
        }
        
        
    }
}