package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem19532 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int temp = a * e - b * d;
        int x = (c * e - b * f) / temp;
        int y = (a * f - c * d) / temp;

        System.out.println(x + " " + y);
        sc.close();
    }
}
