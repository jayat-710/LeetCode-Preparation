class Solution {
    public int lengthOfLastWord(String s) {
    String[] arrOfStr = s.split(" ");
        
        
        return arrOfStr[arrOfStr.length-1].length();
    }
}