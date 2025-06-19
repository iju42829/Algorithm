package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem5988 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String k = sc.nextLine();

            char c = k.charAt(k.length() - 1);

            if ((c - '0') % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }
}
