package chap03_operator.question07;

import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int x = r.nextInt(2);
            System.out.println(x);
            if (x == 1) {
                System.out.println("正面");
            } else {
                System.out.println("反面");
            }
        }
    }
}
