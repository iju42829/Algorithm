package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem10870 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibo(n));
    }

    private static int fibo(int number) {
        if (number == 0) return 0;
        if (number == 1 || number == 2) return 1;

        return fibo(number-1) + fibo(number-2);
    }
}
