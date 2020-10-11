package chap04_processControl.question04;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 2; i < n + 1; i++) {
            int j = 2;
            for (; j <= Math.sqrt(i); j++) {
                if (i % j == 0)
                    break;
            }
            if (j > Math.sqrt(i)) {
                System.out.print(i + "  ");
            }
        }
    }
}
