package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem30017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int x = Math.min(b, a - 1);
        System.out.println(2 * x + 1);
    }
}
