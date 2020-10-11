package chap04_processControl.question05;

public class BitOperator {
    public static void main(String[] args) {
        int a = 0xaaaaaaaa;
        int b = 0x55555555;

        and(a, b);
        or(a, b);
        xor(a, b);

    }

    private static void and(int a, int b) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int num1 = a & 1;
            int num2 = b & 1;
            if (num1 == 1 && num2 == 1) {
                builder.insert(0, 1);
            } else {
                builder.insert(0, 0);
            }
            a >>>= 1;
            b >>>= 1;
        }
        System.out.println(builder.toString());
    }

    private static void or(int a, int b) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int num1 = a & 1;
            int num2 = b & 1;
            if (num1 == 1 || num2 == 1) {
                builder.insert(0, 1);
            } else {
                builder.insert(0, 0);
            }
            a >>>= 1;
            b >>>= 1;
        }
        System.out.println(builder.toString());
    }

    private static void xor(int a, int b) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            int num1 = a & 1;
            int num2 = b & 1;
            if (num1 != num2) {
                builder.insert(0, 1);
            } else {
                builder.insert(0, 0);
            }
            a >>>= 1;
            b >>>= 1;
        }
        System.out.println(builder.toString());
    }
}
