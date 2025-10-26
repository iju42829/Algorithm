package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem10886 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = 0, nc = 0;

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                c++;
            }
            else {
                nc++;
            }
        }

        if (c > nc) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }
    }
}
