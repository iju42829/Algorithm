package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem31654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println((a + b) == c ? "correct!" : "wrong!");
    }
}
