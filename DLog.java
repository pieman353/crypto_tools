import java.math.*;

class DLog {

    public static boolean isPrimitiveElement(BigInteger g, BigInteger p) {
        return false;
    }
    /* Returns array containing dlog(g,x) from 1 to p-1, where g 
     * is a primitive element of Zp
     */
    public static int[] dlog(int g, int p) {
        int [] dlog_table = new int[p - 1];
        for (int i = 1; i < p; i++) {
           BigInteger i_big = BigInteger.valueOf(i);
           BigInteger g_big = BigInteger.valueOf(g);
           BigInteger p_big = BigInteger.valueOf(p);
           int index = g_big.modPow(i_big, p_big).intValue() - 1;
           dlog_table[index] = i;
        }
        return dlog_table;
    }
}
