package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem2506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, streak = 0;

        for (int i = 0; i < n; i++) {
            int result = sc.nextInt();

            if (result == 1) {
                streak++;
                sum += streak;
            } else {
                streak = 0;
            }
        }

        System.out.println(sum);
    }
}
