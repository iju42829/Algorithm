package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem27324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        System.out.println(n.charAt(0) == n.charAt(1) ? 1 : 0);
    }
}
