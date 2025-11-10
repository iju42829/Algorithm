package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem2720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();

            int q = c / 25;
            c %= 25;

            int d = c / 10;
            c %= 10;

            int n = c / 5;
            c %= 5;

            sb.append(q).append(" ")
                    .append(d).append(" ")
                    .append(n).append(" ")
                    .append(c).append("\n");
        }

        System.out.println(sb.toString());
    }
}
