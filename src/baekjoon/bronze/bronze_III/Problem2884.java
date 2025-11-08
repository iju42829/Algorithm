package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(), m = sc.nextInt();

        m -= 45;

        if (m < 0) {
            m += 60;
            h--;
        }

        if (h < 0) h = 23;

        System.out.println(h + " " + m);
    }
}
