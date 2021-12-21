class TrieNode{
    TrieNode child[]= new TrieNode[26];
    boolean isEnd=false;
}
class Trie {
    
    TrieNode root;
    public Trie() {
        root= new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node =root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(node.child[c-'a']==null){
                node.child[c-'a']= new TrieNode();
            }
            
            node= node.child[c-'a'];
            
        }
        node.isEnd=true;
    }
    
    public boolean search(String word) {
        TrieNode node =root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(node.child[c-'a']==null)return false;
            
            node=node.child[c-'a'];
        }
        
        if(!node.isEnd)return false;
        
        
        return true;
    }
    
    public boolean startsWith(String word) {
        TrieNode node =root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(node.child[c-'a']==null)return false;
            
            node=node.child[c-'a'];
        }
        
        // if(!node.isEnd)return false;
        
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */