package baekjoon.bronze.bronze_I;

import java.util.Scanner;

public class Problem11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Integer.toString(n, b).toUpperCase());
    }
}
