package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem9366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            long C = sc.nextLong();

            long max = Math.max(A, Math.max(B, C));
            long sum = A + B + C - max;

            System.out.print("Case #" + t + ": ");

            if (sum <= max) {
                System.out.println("invalid!");
                continue;
            }

            if (A == B && B == C) {
                System.out.println("equilateral");
            }
            else if (A == B || B == C || A == C) {
                System.out.println("isosceles");
            }
            else {
                System.out.println("scalene");
            }
        }
    }
}
