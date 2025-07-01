package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem5522 {

    public static void main(String[] args) {
        int score = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
            score += sc.nextInt();

        System.out.println(score);
    }
}
