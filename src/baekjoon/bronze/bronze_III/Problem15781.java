package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem15781 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int maxHelmet = 0, maxVest = 0;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (maxHelmet < temp) {
                maxHelmet = temp;
            }
        }

        for (int i = 0; i < m; i++) {
            int temp = sc.nextInt();
            if (maxVest < temp) {
                maxVest = temp;
            }
        }

        System.out.println(maxHelmet + maxVest);
    }
}
