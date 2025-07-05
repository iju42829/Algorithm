package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem2747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] fibo = new int[46];

        fibo[1] = 1;
        fibo[2] = 1;

        for (int i = 3; i <= 45; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        System.out.println(fibo[n]);
    }
}
