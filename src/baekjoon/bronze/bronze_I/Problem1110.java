package baekjoon.bronze.bronze_I;

import java.util.Scanner;

public class Problem1110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        while (true) {
            int a = temp / 10;
            int b = temp % 10;

            temp = a + b;
            count++;

            temp = b * 10  + temp % 10;

            if (temp == n) {
                break;
            }
        }

        System.out.println(count);

    }
}
