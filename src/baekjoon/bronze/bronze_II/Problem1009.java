package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();

            int temp = 1;

            for (int j = 0; j < b; j++) {
                temp = (temp * a) % 10;
            }

            int result = temp % 10;

            if (result == 0) {
                System.out.println(10);
            } else {
                System.out.println(result);
            }
        }
    }
}
