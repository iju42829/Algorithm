package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem3058 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int min = Integer.MAX_VALUE;
            int sum = 0;

            for (int j = 0; j < 7; j++) {
                int temp = sc.nextInt();

                if (temp % 2 == 0) {
                    sum += temp;
                    min = Math.min(min, temp);
                }
            }

            System.out.println(sum + " " + min);
        }
    }
}
