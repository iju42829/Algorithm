package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem17863 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int prefix = n / 10000;

        if (prefix == 555) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
