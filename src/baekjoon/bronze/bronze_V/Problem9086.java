package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem9086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String[] s = sc.nextLine().split("");

            System.out.println(s[0] + s[s.length - 1]);
        }
    }
}
