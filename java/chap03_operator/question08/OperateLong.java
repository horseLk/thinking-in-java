package chap03_operator.question08;

public class OperateLong {
    public static void main(String[] args) {
        long a = 0xffffffffa04569bal;
        long b = 0134673522314345l;
        System.out.println(Long.toBinaryString(a));
        System.out.println(Long.toBinaryString(b));
        float f= 3.245f;
        System.out.println(Float.toHexString(f));
    }
}
