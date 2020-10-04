package chap03_operator.question10;

public class OperateBit {
    public static void main(String[] args) {
        int a = 0xaaaaaaaa;
        int b = 0x55555555;
        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a ^ b));
        System.out.println(Integer.toBinaryString(a | b));
    }
}
