package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = 0, T = 0;

        for (int i = 0; i < 4; i++) {
            S += sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            T += sc.nextInt();
        }

        System.out.println(Math.max(S, T));
    }
}
