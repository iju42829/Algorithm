package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem2292 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n == 1) {
            System.out.println(1);
            return;
        }

        long cnt = 1, current = 1, plus = 6;

        while (n > current) {
            current += plus * cnt;
            cnt++;
        }
        System.out.println(cnt);
    }
}
