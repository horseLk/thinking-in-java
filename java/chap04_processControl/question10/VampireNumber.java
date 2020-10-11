package chap04_processControl.question10;

import java.util.HashSet;
import java.util.Set;

/**
 * 吸血鬼数字
 */
public class VampireNumber {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1000; i < 10000; i++) {
            if (i % 100 == 0) continue;
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;
            int d = i / 1000;
            int[] kk = {a, b, c, d};
            for (int j = 0; j < 4; j++) {
                int num1 = kk[j];
                for (int k = 0; k < 4; k++) {
                    if (k == j) continue;
                    int num2 = kk[k];
                    int left1 = num1 * 10 + num2;
                    int left2 = num2 * 10 + num1;
                    int[] hh = new int[2];
                    int ind = 0;
                    for (int l = 0; l < 4; l++) {
                        if (l != j && l != k) hh[ind++] = l;
                    }
                    int right1 = kk[hh[0]] * 10 + kk[hh[1]];
                    int right2 = kk[hh[1]] * 10 + kk[hh[0]];

                    if (left1 * right1 == i || left1 * right2 == i
                        || left2 * right1 == i || left2 * right2 == i) {
                        set.add(i);
                    }
                }
            }
        }

        for (int x : set) {
            System.out.print(x + " ");
        }
    }
}
