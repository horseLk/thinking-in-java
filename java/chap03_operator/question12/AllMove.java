package chap03_operator.question12;

public class AllMove {
    public static void main(String[] args) {
        int x = 0xffffffff;
        System.out.println(Integer.toBinaryString(x));
        x <<= 1;
        while (x != 0) {
            System.out.println(Integer.toBinaryString(x));
            x >>>= 1;
        }
    }
}
