package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (numbers[i] == v)
                count++;
        }

        System.out.println(count);
    }
}
