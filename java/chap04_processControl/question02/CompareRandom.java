package chap04_processControl.question02;

import java.util.Random;

public class CompareRandom {
    public static void main(String[] args) {
        Random r = new Random(47);
        int num1 = r.nextInt(26);
        for (int i = 0; i < 24; i++) {
            int num2 = r.nextInt(26);
            System.out.print(num1);
            if (num1 > num2) {
                System.out.print(" > ");
            } else if (num1 == num2) {
                System.out.print(" = ");
            } else {
                System.out.print(" < ");
            }
            System.out.println(num2);
            num1 = num2;
        }
    }
}
