package chap04_processControl.question06;

import java.util.Date;
import java.util.Random;

public class ReloadTest {
    public static void main(String[] args) {
        test(new Date().getTime());
    }
    public static boolean test(long seed) {
        Random r = new Random(seed);
        int begin = r.nextInt(50);
        int end = r.nextInt(50);
        int val = r.nextInt(50);
        if (begin <= val && end >= val) return true;
        return false;
    }
}
