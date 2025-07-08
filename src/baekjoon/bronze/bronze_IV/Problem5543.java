package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem5543 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            h = Math.min(h, sc.nextInt());
        }

        System.out.println(Math.min(sc.nextInt(), sc.nextInt()) + h - 50);
    }
}
