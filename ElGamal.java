import java.math.*;

class ElGamal {
    /* Input: p = prime number 
     *        g = generator
     *        a = private key 
     *        b = shared secret
     *        In other words (p,g,a,b) represent ELGamal key
     *        (r,t) = encrypted ElGamal text
     * Output: plaintext */
    public static int decrypt(int p, int g, int a, int b, int r, int t) {
        BigInteger p_big = BigInteger.valueOf(p);
        BigInteger r_big = BigInteger.valueOf(r);
        BigInteger t_big = BigInteger.valueOf(t);
        BigInteger a_big = BigInteger.valueOf(a);
        BigInteger ans = (t_big.mod(p_big)).divide(r_big.modPow(a_big, p_big));
        return ans.intValue();
    }

}
