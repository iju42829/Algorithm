package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem10156 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int total = k * n;

        if (total <= m)
            System.out.println(0);
        else
            System.out.println(total - m);
    }
}
