package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem15964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println((a + b) * (a - b));
    }
}
