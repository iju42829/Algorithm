package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem6131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;

        for (int a = 1; a <= 500; a++) {
            int tempA = a * a;

            for (int b = 1; b <= a; b++) {
                int tempB = b * b;
                if (tempA == tempB + n) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
