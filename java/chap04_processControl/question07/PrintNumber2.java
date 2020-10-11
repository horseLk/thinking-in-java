package chap04_processControl.question07;

public class PrintNumber2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            if (i != 0 && i % 10 == 0) System.out.println();
            System.out.print(i + " ");
            if (i == 99) break;
        }
    }
}
