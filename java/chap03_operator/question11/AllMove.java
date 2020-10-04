package chap03_operator.question11;

public class AllMove {
    public static void main(String[] args) {
        int x = 0x9a123bce;
        while (x != 0) {
            System.out.println(Integer.toBinaryString(x));
            x >>>= 1;
        }
    }
}
