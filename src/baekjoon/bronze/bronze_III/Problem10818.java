package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();

            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }

        System.out.println(min + " " + max);
    }
}
