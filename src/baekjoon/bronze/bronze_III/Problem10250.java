package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem10250 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int h = sc.nextInt(), w = sc.nextInt(), n = sc.nextInt();

            int y = (n-1) % h + 1;
            int x = (n-1) / h + 1;

            System.out.println(y * 100 + x);
        }
    }
}
