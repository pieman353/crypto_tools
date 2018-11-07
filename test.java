import java.util.*;

class test {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(DLog.dlog(3, 17)));
        System.out.println(Secret.shamirLinear(1, 4, 3, 2));
        System.out.println(Secret.shamirLinear(1,4,5,10));
        System.out.println(Secret.shamirLinear(1,4,7,11));
        System.out.println(Secret.shamirLinear(3,2,5,10));
        System.out.println(Secret.shamirLinear(3,2,7,11));
        System.out.println(Secret.shamirLinear(5,10,7,11));
    }
}
