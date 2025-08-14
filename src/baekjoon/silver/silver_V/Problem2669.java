package baekjoon.silver.silver_V;

import java.util.Scanner;

public class Problem2669 {

    public static void main(String[] args) {
        int[][] maps = new int[101][101];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

            for (int j = a; j < c; j++) {
                for (int k = b; k < d; k++) {
                    if (maps[j][k] == 0) {
                        maps[j][k] = 1;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
