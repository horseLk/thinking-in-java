package chap04_processControl.question09;

public class Fibonacci {
    public static void main(String[] args) {
        int num = Integer.valueOf(args[0]);
//        int num = 6;
        if (num == 0) return;
        int[] res = new int[num + 1];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < num + 1; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        for (int i = 1; i < num + 1; i++) {
            System.out.println(res[i] + " ");
        }
    }
}
