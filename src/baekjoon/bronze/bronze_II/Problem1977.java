package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(), n = sc.nextInt();

        int min = (int) Math.ceil(Math.sqrt(m));
        int max = (int) Math.floor(Math.sqrt(n));

        if (min > max) {
            System.out.println(-1);
            return;
        }

        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i * i;
        }

        System.out.println(sum);
        System.out.println(min * min);
    }
}
