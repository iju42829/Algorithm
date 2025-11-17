package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem4458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            char first = Character.toUpperCase(s.charAt(0));
            String result = first + s.substring(1);

            System.out.println(result);
        }
    }
}
