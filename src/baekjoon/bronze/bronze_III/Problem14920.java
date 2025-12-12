package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem14920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();

        long n = 1;

        while (x != 1) {
            if (x % 2 == 0) x /= 2;
            else
                x = 3 * x + 1;
            n++;
        }

        System.out.println(n);
    }
}
