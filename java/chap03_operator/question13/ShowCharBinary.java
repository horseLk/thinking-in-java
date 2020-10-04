package chap03_operator.question13;

public class ShowCharBinary {
    public static void show(char c) {
        System.out.println(Integer.toBinaryString(c));
    }
    public static void main(String[] args) {
        char c = 'a';
        show(c);
    }
}
