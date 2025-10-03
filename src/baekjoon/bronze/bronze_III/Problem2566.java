package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem2566 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int x = 0, y = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int temp = sc.nextInt();

                if (temp > max) {
                    max = temp;
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
