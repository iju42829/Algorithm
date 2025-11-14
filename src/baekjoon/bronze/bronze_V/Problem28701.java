package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem28701 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;
        int square = sum * sum;

        System.out.println(sum);
        System.out.println(square);
        System.out.println(square);
    }
}
