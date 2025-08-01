package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem29751 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();

        System.out.printf("%.1f\n", (w * h / 2.0));
    }
}
