package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem25784 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a == b + c || b == a + c || c == a + b) {
            System.out.println(1);
        } else if (a == b * c || b == a * c || c == a * b) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
