package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), count = 0;

        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() == n)
                count++;
        }

        System.out.println(count);
    }
}
