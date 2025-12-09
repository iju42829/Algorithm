package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem2476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

            max = Math.max(calc(a, b, c), max);
        }

        System.out.println(max);
    }

    private static int calc(int a, int b, int c) {
        if (a == b && b == c) {
            return 10000 + a * 1000;
        } else if (a == b || a == c) {
            return 1000 + a * 100;
        } else if (b == c) {
            return 1000 + b * 100;
        } else {
            int max = a;
            if (b > max) max = b;
            if (c > max) max = c;
            return max * 100;
        }
    }
}
