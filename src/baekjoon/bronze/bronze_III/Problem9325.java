package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem9325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int s = sc.nextInt();
            int n = sc.nextInt();

            for (int j = 0; j < n; j++) {
                int p = sc.nextInt();
                int q = sc.nextInt();
                s += p * q;
            }

            System.out.println(s);
        }
    }
}
