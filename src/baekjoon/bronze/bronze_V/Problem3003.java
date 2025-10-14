package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] answer = {1, 1, 2, 2, 2, 8};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            sb.append(answer[i] - sc.nextInt()).append(" ");
        }

        sb.append("\n");

        System.out.println(sb.toString());
    }
}
