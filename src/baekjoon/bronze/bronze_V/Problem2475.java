package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem2475 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 0;

        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();

            number += temp * temp;
        }

        System.out.println(number % 10);
    }
}
