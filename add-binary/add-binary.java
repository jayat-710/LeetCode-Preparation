import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        
         BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        
        BigInteger res =x.add(y);
        
        return res.toString(2);
        
        
        
    }
}