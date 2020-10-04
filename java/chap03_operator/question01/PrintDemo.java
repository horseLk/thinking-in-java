package chap03_operator.question01;

import java.util.Date;

public class PrintDemo {
    public void print() {
        System.out.print("Hello, it's: ");
        System.out.println(new Date());
    }

    public static void main(String[] args) {
        new PrintDemo().print();
    }
}
