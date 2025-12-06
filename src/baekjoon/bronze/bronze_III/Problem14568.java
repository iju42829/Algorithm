package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem14568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long count = 0;

        for (int a = 2; a <= n - 2; a += 2) {
            for (int b = 1; b <= n - 1 - a; b++) {
                int c = n - a - b;
                if (c <= 0) continue;
                if (c >= b + 2)
                    count++;
            }
        }

        System.out.println(count);
    }
}
