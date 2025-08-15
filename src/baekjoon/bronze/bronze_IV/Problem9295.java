package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem9295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.printf("Case %d: %d\n", i, sc.nextInt() + sc.nextInt());
        }
    }
}
