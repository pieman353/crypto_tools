class Secret {

    /*public static int[] sessionKeys(int a, int b, int c, int rA, int rB, int rC) {
        
    } */

    public static double shamirLinear(int x1, int y1, int x2, int y2) {
        double a = y2 - y1;
        double b = x1 - x2;
        double c = a*(x1) + b*(x2);
        if (b < 0) {
            return -(c / b);
        }
        else {
            return c / b;
        }
    }
}
