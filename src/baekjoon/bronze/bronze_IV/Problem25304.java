package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem25304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), n = sc.nextInt(), sum = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            sum += a * b;
        }

        if (x == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
